package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelBoar;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityBoar;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderBoar extends MobRenderer<EntityBoar, ModelBoar<EntityBoar>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mythicalcreatures:textures/entity/boar/boar.png");

    public RenderBoar(EntityRendererManager rendererManager) {
        super(rendererManager, new ModelBoar(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBoar entity) {
        return TEXTURE;
    }
}
