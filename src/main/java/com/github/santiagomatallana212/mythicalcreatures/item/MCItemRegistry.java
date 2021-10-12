package com.github.santiagomatallana212.mythicalcreatures.item;

import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import com.github.santiagomatallana212.mythicalcreatures.entity.MCEntityRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MCItemRegistry {

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new SpawnEggItem(MCEntityRegistry.BOAR, 0x28140d, 0x07080b, new Item.Properties().tab(CreativeModeTab.TAB_MISC)).setRegistryName("mythicalcreatures:boar_spawn_egg"));
        event.getRegistry().register(new SpawnEggItem(MCEntityRegistry.ORC, 0x8fd422, 0x3d270a, new Item.Properties().tab(CreativeModeTab.TAB_MISC)).setRegistryName("mythicalcreatures:orc_spawn_egg"));
        event.getRegistry().register(new SpawnEggItem(MCEntityRegistry.MINOTAUR, 0x974100, 0x3F290D, new Item.Properties().tab(CreativeModeTab.TAB_MISC)).setRegistryName("mythicalcreatures:minotaur_spawn_egg"));
        event.getRegistry().register(new SpawnEggItem(MCEntityRegistry.CENTAUR, 0x000000, 0xFFFFFF, new Item.Properties().tab(CreativeModeTab.TAB_MISC)).setRegistryName("mythicalcreatures:centaur_spawn_egg"));
    }
}
