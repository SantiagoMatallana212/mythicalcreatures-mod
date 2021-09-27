package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelOrc;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityOrc;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderOrc extends MobRenderer<EntityOrc, ModelOrc> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mythicalcreatures:textures/entity/orc/orc.png");

    public RenderOrc(EntityRendererProvider.Context rendererManager) {
        super(rendererManager, new ModelOrc(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityOrc entity) {
        return TEXTURE;
    }
}
