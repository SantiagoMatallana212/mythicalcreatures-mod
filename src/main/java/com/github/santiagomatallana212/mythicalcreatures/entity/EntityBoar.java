package com.github.santiagomatallana212.mythicalcreatures.entity;

import com.github.alexthe666.citadel.animation.Animation;
import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class EntityBoar extends Animal implements IAnimatedEntity {
    private static final Ingredient TEMPT_ITEMS = Ingredient.of(Items.CARROT, Items.POTATO, Items.BEETROOT);

    protected EntityBoar(EntityType entityType, Level world) {
        super(entityType, world);
    }

    public static AttributeSupplier.Builder bakeAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.FOLLOW_RANGE, 64D)
                .add(Attributes.ATTACK_DAMAGE, 10D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new FloatGoal(this));
        this.goalSelector.addGoal(4, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, (new HurtByTargetGoal(this).setAlertOthers()));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.5D, true));
        this.goalSelector.addGoal(5, new TemptGoal(this, 1.2D, TEMPT_ITEMS, false));
        this.goalSelector.addGoal(6, new FollowParentGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.PIG_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_29502_) {
        return SoundEvents.PIG_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.PIG_DEATH;
    }

    protected void playStepSound(BlockPos p_29492_, BlockState p_29493_) {
        this.playSound(SoundEvents.PIG_STEP, 0.15F, 1.0F);
    }

    public EntityBoar getBreedOffspring(ServerLevel level, AgeableMob ageableMob) {
        return MCEntityRegistry.BOAR.get().create(level);
    }

    @Override
    public int getAnimationTick() {
        return 0;
    }

    @Override
    public void setAnimationTick(int i) {

    }

    @Override
    public Animation getAnimation() {
        return null;
    }

    @Override
    public void setAnimation(Animation animation) {

    }

    @Override
    public Animation[] getAnimations() {
        return new Animation[0];
    }
}
