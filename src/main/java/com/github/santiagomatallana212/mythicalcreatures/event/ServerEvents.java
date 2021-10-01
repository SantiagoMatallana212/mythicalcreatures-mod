package com.github.santiagomatallana212.mythicalcreatures.event;

import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import com.github.santiagomatallana212.mythicalcreatures.config.MCConfig;
import com.github.santiagomatallana212.mythicalcreatures.entity.ai.VillagerAIFearHostile;
import com.github.santiagomatallana212.mythicalcreatures.entity.util.IVillagerFear;
import com.google.common.base.Predicate;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID)
public class ServerEvents {
    private static final Predicate VILLAGER_FEAR = new Predicate<LivingEntity>() {
        @Override
        public boolean apply(@Nullable LivingEntity entity) {
            return entity != null && entity instanceof IVillagerFear;
        }
    };

    @SubscribeEvent
    public void onEntityJoinWorld(LivingSpawnEvent.SpecialSpawn event) {
        try {
            if (event.getEntity() != null && event.getEntity() instanceof AbstractVillager && MCConfig.villagersFearHostile) {
                AbstractVillager villager = (AbstractVillager) event.getEntity();
                villager.goalSelector.addGoal(1, new VillagerAIFearHostile((PathfinderMob) villager, LivingEntity.class, 8.0F,0.8D, 0.8D, VILLAGER_FEAR));
            }
        }catch (Exception e) {
            MythicalCreatures.LOGGER.warn("Tried to add unique behaviors to vanilla mobs and encountered an error");
        }
    }
}
