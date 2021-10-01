package com.github.santiagomatallana212.mythicalcreatures.config;

import com.github.alexthe666.citadel.config.biome.SpawnBiomeConfig;
import com.github.alexthe666.citadel.config.biome.SpawnBiomeData;
import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import org.apache.commons.lang3.tuple.Pair;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BiomeConfig {
    public static Pair<String, SpawnBiomeData> boar = Pair.of("mythicalcreatures:boar_spawns", DefaultBiomes.BOAR);
    public static Pair<String, SpawnBiomeData> centaur = Pair.of("mythicalcreatures:centaur_spawns", DefaultBiomes.CENTAUR);

    private static boolean init = false;
    private static Map<String, SpawnBiomeData> biomeConfigValues = new HashMap<>();

    public static void init() {
        try {
            for (Field f : BiomeConfig.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Pair){
                    String id = (String)((Pair) obj).getLeft();
                    SpawnBiomeData data = (SpawnBiomeData)((Pair) obj).getRight();
                    biomeConfigValues.put(id, SpawnBiomeConfig.create(new ResourceLocation(id), data));
                }
            }
        }catch (Exception e) {
            MythicalCreatures.LOGGER.warn("Encountered an error building biome config .json files");
            e.printStackTrace();
        }
        init = true;
    }

    public static boolean test(Pair<String, SpawnBiomeData> entry, Biome biome) {
        if (!init) {
            return false;
        }
        return biomeConfigValues.get(entry.getKey()).matches(biome);
    }
}
