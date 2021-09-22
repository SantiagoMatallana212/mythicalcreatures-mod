package com.github.santiagomatallana212.mythicalcreatures.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class EntityBoar extends AnimalEntity {
    private static final Ingredient TEMPT_ITEMS = Ingredient.of(Items.CARROT, Items.POTATO, Items.BEETROOT);

    protected EntityBoar(EntityType entityType, World world) {
        super(entityType, world);
    }

    public static AttributeModifierMap.MutableAttribute bakeAttributes() {
        return AnimalEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.FOLLOW_RANGE, 64D)
                .add(Attributes.ATTACK_DAMAGE, 10D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new SwimGoal(this));
        this.goalSelector.addGoal(4, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, (new HurtByTargetGoal(this).setAlertOthers()));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.5D, true));
        this.goalSelector.addGoal(5, new TemptGoal(this, 1.2D, false, TEMPT_ITEMS));
        this.goalSelector.addGoal(6, new FollowParentGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(9, new LookRandomlyGoal(this));
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.PIG_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.PIG_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.PIG_DEATH;
    }

    protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        this.playSound(SoundEvents.PIG_STEP, 0.15F, 1.0F);
    }

    public EntityBoar getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return MCEntityRegistry.BOAR.get().create(this.level);
    }
}
