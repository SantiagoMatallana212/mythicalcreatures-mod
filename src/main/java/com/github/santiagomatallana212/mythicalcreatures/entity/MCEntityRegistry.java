package com.github.santiagomatallana212.mythicalcreatures.entity;

import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;
import java.util.Random;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MCEntityRegistry {

    public static final EntityType<EntityBoar> BOAR = registerEntity(EntityType.Builder.of(EntityBoar::new, MobCategory.CREATURE).sized(1.2F, 1.75F), "boar");/*0x28140d, 0x07080b*/
    public static final EntityType<EntityOrc> ORC = registerEntity(EntityType.Builder.of(EntityOrc::new, MobCategory.MONSTER).sized(1.2F, 2.7F), "orc");/*0x8fd422, 0x3d270*/
    public static final EntityType<EntityMinotaur> MINOTAUR = registerEntity(EntityType.Builder.of(EntityMinotaur::new, MobCategory.MONSTER).sized(2.0F, 4.0F), "minotaur"); /*0x974100, 0x3F290D*/
    public static final EntityType<EntityCentaur> CENTAUR = registerEntity(EntityType.Builder.of(EntityCentaur::new, MobCategory.CREATURE).sized(1.0F, 2.6F), "centaur");/*0x000000, 0xFFFFFF*/

    private static final EntityType registerEntity(EntityType.Builder builder, String entityName) {
        ResourceLocation nameLoc = new ResourceLocation(MythicalCreatures.MOD_ID, entityName);
        return (EntityType) builder.build(entityName).setRegistryName(nameLoc);
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        try {
            for (Field f : MCEntityRegistry.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof EntityType) {
                    event.getRegistry().register((EntityType) obj);
                } else if (obj instanceof EntityType[]) {
                    for (EntityType type : (EntityType[]) obj) {
                        event.getRegistry().register(type);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(BOAR, EntityBoar.bakeAttributes().build());
        event.put(ORC, EntityOrc.bakeAttributes().build());
        event.put(MINOTAUR, EntityMinotaur.bakeAttributes().build());
        event.put(CENTAUR, EntityCentaur.bakeAttributes().build());
    }

    public static boolean rollSpawn(int rolls, Random random, MobSpawnType reason){
        if(reason == MobSpawnType.SPAWNER){
            return true;
        }else{
            return rolls <= 0 || random.nextInt(rolls) == 0;
        }
    }
}
