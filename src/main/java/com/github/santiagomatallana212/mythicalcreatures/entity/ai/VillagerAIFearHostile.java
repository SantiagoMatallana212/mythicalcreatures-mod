package com.github.santiagomatallana212.mythicalcreatures.entity.ai;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;

import java.util.function.Predicate;

public class VillagerAIFearHostile extends AvoidEntityGoal<LivingEntity> {
    public VillagerAIFearHostile(PathfinderMob mob, Class<LivingEntity> avoidClass, float distance, double nearSpeedIn, double farSpeedIn, Predicate<LivingEntity> targetPredicate) {
        super(mob, avoidClass, distance, nearSpeedIn, farSpeedIn, targetPredicate);
    }
}
