package com.github.santiagomatallana212.mythicalcreatures.world;

import com.github.alexthe666.citadel.config.biome.SpawnBiomeData;
import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import com.github.santiagomatallana212.mythicalcreatures.config.BiomeConfig;
import com.github.santiagomatallana212.mythicalcreatures.config.MCConfig;
import com.github.santiagomatallana212.mythicalcreatures.entity.MCEntityRegistry;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.commons.lang3.tuple.Pair;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MCWorldRegistry {
    public static boolean initBiomes = false;

    public static void onBiomesLoad(BiomeLoadingEvent event) {
        initBiomes = true;
        Biome biome = ForgeRegistries.BIOMES.getValue(event.getName());
        if (testBiome(BiomeConfig.boar, biome) && MCConfig.boarSpawnWeight > 0) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(MCEntityRegistry.BOAR, MCConfig.boarSpawnWeight, 2, 3));
        }
        if (testBiome(BiomeConfig.centaur, biome) && MCConfig.centaurSpawnWeight > 0) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(MCEntityRegistry.CENTAUR, MCConfig.centaurSpawnWeight, 7, 7));
        }
    }

    private static boolean testBiome(Pair<String, SpawnBiomeData> entry, Biome biome) {
        boolean result = false;
        try {
            result = BiomeConfig.test(entry, biome);
        }catch (Exception e) {
            MythicalCreatures.LOGGER.warn("could not test biome config for " + entry.getLeft() + ", defaulting to no spawns for mob");
            result = false;
        }
        return result;
    }
}
