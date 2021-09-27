package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.ClientHandler;
import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelBoar;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityBoar;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderBoar extends MobRenderer<EntityBoar, ModelBoar> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mythicalcreatures:textures/entity/boar/boar.png");

    public RenderBoar(EntityRendererProvider.Context rendererManager) {
        super(rendererManager, new ModelBoar(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityBoar entity) {
        return TEXTURE;
    }
}
