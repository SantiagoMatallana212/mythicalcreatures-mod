package com.github.santiagomatallana212.mythicalcreatures;

import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderBoar;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderCentaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderMinotaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderOrc;
import com.github.santiagomatallana212.mythicalcreatures.config.ConfigHandler;
import com.github.santiagomatallana212.mythicalcreatures.entity.MCEntityRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(value = MythicalCreatures.MOD_ID)
public class MythicalCreatures {
    public static final String MOD_ID = "mythicalcreatures";

    public MythicalCreatures() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.spec);
        registerDeferredRegistries(eventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void setupClient(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(MCEntityRegistry.ORC.get(), RenderOrc::new);
        RenderingRegistry.registerEntityRenderingHandler(MCEntityRegistry.BOAR.get(), RenderBoar::new);
        RenderingRegistry.registerEntityRenderingHandler(MCEntityRegistry.MINOTAUR.get(), RenderMinotaur::new);
        RenderingRegistry.registerEntityRenderingHandler(MCEntityRegistry.CENTAUR.get(), RenderCentaur::new);
    }

    public static void registerDeferredRegistries(IEventBus modBus) {
        MCEntityRegistry.ENTITY_DEFERRED.register(modBus);
    }
}
