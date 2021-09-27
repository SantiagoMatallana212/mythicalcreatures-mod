package com.github.santiagomatallana212.mythicalcreatures.client;

import com.github.santiagomatallana212.mythicalcreatures.MythicalCreatures;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderBoar;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderCentaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderMinotaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.RenderOrc;
import com.github.santiagomatallana212.mythicalcreatures.entity.MCEntityRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythicalCreatures.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientHandler {
    public static ModelLayerLocation BOAR_LAYER = new ModelLayerLocation(new ResourceLocation(MythicalCreatures.MOD_ID, "boar"), "boar");
    public static ModelLayerLocation ORC_LAYER = new ModelLayerLocation(new ResourceLocation(MythicalCreatures.MOD_ID, "orc"), "orc");
    public static ModelLayerLocation MINOTAUR_LAYER = new ModelLayerLocation(new ResourceLocation(MythicalCreatures.MOD_ID, "minotaur"), "minotaur");
    public static ModelLayerLocation CENTAUR_LAYER = new ModelLayerLocation(new ResourceLocation(MythicalCreatures.MOD_ID, "centaur"), "centaur");
    public static void init() {

    }

    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(MCEntityRegistry.BOAR.get(), RenderBoar::new);
        event.registerEntityRenderer(MCEntityRegistry.ORC.get(), RenderOrc::new);
        event.registerEntityRenderer(MCEntityRegistry.MINOTAUR.get(), RenderMinotaur::new);
        event.registerEntityRenderer(MCEntityRegistry.CENTAUR.get(), RenderCentaur::new);
    }

}
