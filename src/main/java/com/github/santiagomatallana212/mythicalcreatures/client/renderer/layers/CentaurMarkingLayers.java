package com.github.santiagomatallana212.mythicalcreatures.client.renderer.layers;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelCentaur;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityCentaur;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Markings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class CentaurMarkingLayers extends RenderLayer<EntityCentaur, ModelCentaur> {
    private static final Map<Markings, ResourceLocation> LOCATION_BY_MARKINGS = Util.make(Maps.newEnumMap(Markings.class), (p_239406_0_) -> {
        p_239406_0_.put(Markings.NONE, (ResourceLocation)null);
        p_239406_0_.put(Markings.WHITE, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_white.png"));
        p_239406_0_.put(Markings.WHITE_FIELD, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_whitefield.png"));
        p_239406_0_.put(Markings.WHITE_DOTS, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_whitedots.png"));
        p_239406_0_.put(Markings.BLACK_DOTS, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_blackdots.png"));
    });

    public CentaurMarkingLayers(RenderLayerParent<EntityCentaur, ModelCentaur> p_117045_) {
        super(p_117045_);
    }


    public void render(PoseStack p_117058_, MultiBufferSource p_117059_, int p_117060_, EntityCentaur p_117061_, float p_117062_, float p_117063_, float p_117064_, float p_117065_, float p_117066_, float p_117067_) {
        ResourceLocation resourcelocation = LOCATION_BY_MARKINGS.get(p_117061_.getMarkings());
        if (resourcelocation != null && !p_117061_.isInvisible()) {
            VertexConsumer vertexconsumer = p_117059_.getBuffer(RenderType.entityTranslucent(resourcelocation));
            this.getParentModel().renderToBuffer(p_117058_, vertexconsumer, p_117060_, LivingEntityRenderer.getOverlayCoords(p_117061_, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}