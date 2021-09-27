package com.github.santiagomatallana212.mythicalcreatures.entity;

import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MCEntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_DEFERRED = DeferredRegister.create(ForgeRegistries.ENTITIES, MythicalCreatures.MOD_ID);
    private static final List<Item> SPAWN_EGGS = Lists.newArrayList();

    public static final RegistryObject<EntityType<EntityBoar>> BOAR = createAnimal("boar", EntityBoar::new, 1.2F, 1.75F, 0x28140d, 0x07080b);
    public static final RegistryObject<EntityType<EntityOrc>> ORC = createMonster("orc", EntityOrc::new, 1.2F, 2.7F, 0x8fd422, 0x3d270a);
    public static final RegistryObject<EntityType<EntityMinotaur>> MINOTAUR = createMonster("minotaur", EntityMinotaur::new, 2.0F, 4.0F, 0x974100, 0x3F290D);
    public static final RegistryObject<EntityType<EntityCentaur>> CENTAUR = createCreature("centaur", EntityCentaur::new, 1.0F, 2.6F, 0x000000, 0xFFFFFF);

    private static <T extends Animal> RegistryObject<EntityType<T>> createAnimal(String name, EntityType.EntityFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary) {
        ResourceLocation location = new ResourceLocation(MythicalCreatures.MOD_ID, name);
        EntityType<T> entity = EntityType.Builder.of(factory, MobCategory.CREATURE).sized(width, height).setTrackingRange(64).setUpdateInterval(1).build(location.toString());
        Item spawnEgg = new SpawnEggItem(entity, eggPrimary, eggSecondary, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC));
        spawnEgg.setRegistryName(new ResourceLocation(MythicalCreatures.MOD_ID, name + "_spawn_egg"));
        SPAWN_EGGS.add(spawnEgg);

        return ENTITY_DEFERRED.register(name, () -> entity);
    }

    private static <T extends Monster> RegistryObject<EntityType<T>> createMonster(String name, EntityType.EntityFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary) {
        ResourceLocation location = new ResourceLocation(MythicalCreatures.MOD_ID, name);
        EntityType<T> entity = EntityType.Builder.of(factory, MobCategory.MONSTER).sized(width, height).setTrackingRange(64).setUpdateInterval(1).build(location.toString());
        Item spawnEgg = new SpawnEggItem(entity, eggPrimary, eggSecondary, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC));
        spawnEgg.setRegistryName(new ResourceLocation(MythicalCreatures.MOD_ID, name + "_spawn_egg"));
        SPAWN_EGGS.add(spawnEgg);

        return ENTITY_DEFERRED.register(name, () -> entity);
    }

    private static <T extends PathfinderMob> RegistryObject<EntityType<T>> createCreature(String name, EntityType.EntityFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary) {
        ResourceLocation location = new ResourceLocation(MythicalCreatures.MOD_ID, name);
        EntityType<T> entity = EntityType.Builder.of(factory, MobCategory.CREATURE).sized(width, height).setTrackingRange(64).setUpdateInterval(1).build(location.toString());
        Item spawnEgg = new SpawnEggItem(entity, eggPrimary, eggSecondary, (new Item.Properties()).tab(CreativeModeTab.TAB_MISC));
        spawnEgg.setRegistryName(new ResourceLocation(MythicalCreatures.MOD_ID, name + "_spawn_egg"));
        SPAWN_EGGS.add(spawnEgg);

        return ENTITY_DEFERRED.register(name, () -> entity);
    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(BOAR.get(), EntityBoar.bakeAttributes().build());
        event.put(ORC.get(), EntityOrc.bakeAttributes().build());
        event.put(MINOTAUR.get(), EntityMinotaur.bakeAttributes().build());
        event.put(CENTAUR.get(), EntityCentaur.bakeAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnEggs(RegistryEvent.Register<Item> event) {
        for (Item spawnEgg : SPAWN_EGGS) {
            Preconditions.checkNotNull(spawnEgg.getRegistryName(), "registryName");
            event.getRegistry().register(spawnEgg);
        }
    }
}
