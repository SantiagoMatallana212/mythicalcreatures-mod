package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelMinotaur;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityMinotaur;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderMinotaur extends MobRenderer<EntityMinotaur, ModelMinotaur<EntityMinotaur>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mythicalcreatures:textures/entity/minotaur/minotaur.png");

    public RenderMinotaur(EntityRendererManager rendererManager) {
        super(rendererManager, new ModelMinotaur(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMinotaur entity) {
        return TEXTURE;
    }
}
