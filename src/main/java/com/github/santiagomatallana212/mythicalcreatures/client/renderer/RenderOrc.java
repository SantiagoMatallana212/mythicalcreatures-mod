package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelOrc;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityOrc;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderOrc extends MobRenderer<EntityOrc, ModelOrc<EntityOrc>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mythicalcreatures:textures/entity/orc/orc.png");

    public RenderOrc(EntityRendererManager rendererManager) {
        super(rendererManager, new ModelOrc(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityOrc entity) {
        return TEXTURE;
    }
}
