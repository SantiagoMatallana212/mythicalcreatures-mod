package com.github.santiagomatallana212.mythicalcreatures.config;

import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import net.minecraftforge.fml.config.ModConfig;

public class MCConfig {
    public static int boarSpawnWeight = 10;
    public static int boarSpawnRolls = 0;
    public static int centaurSpawnWeight = 10;
    public static int centaurSpawnRolls = 0;
    public static boolean villagersFearHostile = true;

    public static void bakeCommon(final ModConfig config) {
        try {
            boarSpawnWeight = ConfigHolder.COMMON.boarSpawnWeight.get();
            boarSpawnRolls = ConfigHolder.COMMON.boarSpawnRolls.get();
            centaurSpawnWeight = ConfigHolder.COMMON.centaurSpawnWeight.get();
            centaurSpawnRolls = ConfigHolder.COMMON.centaurSpawnRolls.get();
            villagersFearHostile = ConfigHolder.COMMON.villagersFearHostile.get();
        }catch (Exception e) {
            MythicalCreatures.LOGGER.warn("An exception occur while trying to load the config for Mythical Creatures");
        }
    }
}
