package com.github.santiagomatallana212.mythicalcreatures.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public final ForgeConfigSpec.BooleanValue villagersFearHostile;
    public final ForgeConfigSpec.IntValue boarSpawnWeight;
    public final ForgeConfigSpec.IntValue boarSpawnRolls;
    public final ForgeConfigSpec.IntValue centaurSpawnWeight;
    public final ForgeConfigSpec.IntValue centaurSpawnRolls;

    public CommonConfig(final ForgeConfigSpec.Builder builder) {
        builder.push("spawning");
        boarSpawnWeight = buildInt(builder, "boarSpawnWeight", "spawn", MCConfig.boarSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        boarSpawnRolls = buildInt(builder, "boarSpawnRolls", "spawn", MCConfig.boarSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        centaurSpawnWeight = buildInt(builder, "centaurSpawnWeight", "spawn", MCConfig.centaurSpawnWeight, 0, 1000, "Spawn Weight, added to a pool of other mobs for each biome. Higher number = higher chance of spawning. 0 = disable spawn");
        centaurSpawnRolls = buildInt(builder, "centaurSpawnRolls", "spawn", MCConfig.centaurSpawnRolls, 0, Integer.MAX_VALUE, "Random roll chance to enable mob spawning. Higher number = lower chance of spawning");
        builder.pop();
        builder.push("behavior");
        villagersFearHostile = buildBoolean(builder, "Villagers fear hostile", "all", true, "True if villagers should fear hostile Mythical Creatures Mobs.");
    }

    private static ForgeConfigSpec.BooleanValue buildBoolean(ForgeConfigSpec.Builder builder, String name, String category, boolean defaultValue, String comment){
        return builder.comment(comment).translation(name).define(name, defaultValue);
    }

    private static ForgeConfigSpec.IntValue buildInt(ForgeConfigSpec.Builder builder, String name, String category, int defaultValue, int min, int max, String comment){
        return builder.comment(comment).translation(name).defineInRange(name, defaultValue, min, max);
    }

    private static ForgeConfigSpec.DoubleValue buildDouble(ForgeConfigSpec.Builder builder, String name, String category, double defaultValue, double min, double max, String comment){
        return builder.comment(comment).translation(name).defineInRange(name, defaultValue, min, max);
    }
}
