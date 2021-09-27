package com.github.santiagomatallana212.mythicalcreatures.client.renderer.layers;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelCentaur;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityCentaur;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import java.util.Map;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.horse.CoatTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CentaurMarkingLayers extends LayerRenderer<EntityCentaur, ModelCentaur<EntityCentaur>> {
    private static final Map<CoatTypes, ResourceLocation> LOCATION_BY_MARKINGS = Util.make(Maps.newEnumMap(CoatTypes.class), (p_239406_0_) -> {
        p_239406_0_.put(CoatTypes.NONE, (ResourceLocation)null);
        p_239406_0_.put(CoatTypes.WHITE, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_white.png"));
        p_239406_0_.put(CoatTypes.WHITE_FIELD, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_whitefield.png"));
        p_239406_0_.put(CoatTypes.WHITE_DOTS, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_whitedots.png"));
        p_239406_0_.put(CoatTypes.BLACK_DOTS, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_markings_blackdots.png"));
    });

    public CentaurMarkingLayers(IEntityRenderer<EntityCentaur, ModelCentaur<EntityCentaur>> p_i232476_1_) {
        super(p_i232476_1_);
    }


    public void render(MatrixStack p_225628_1_, IRenderTypeBuffer p_225628_2_, int p_225628_3_, EntityCentaur p_225628_4_, float p_225628_5_, float p_225628_6_, float p_225628_7_, float p_225628_8_, float p_225628_9_, float p_225628_10_) {
        ResourceLocation resourcelocation = LOCATION_BY_MARKINGS.get(p_225628_4_.getMarkings());
        if (resourcelocation != null && !p_225628_4_.isInvisible()) {
            IVertexBuilder ivertexbuilder = p_225628_2_.getBuffer(RenderType.entityTranslucent(resourcelocation));
            this.getParentModel().renderToBuffer(p_225628_1_, ivertexbuilder, p_225628_3_, LivingRenderer.getOverlayCoords(p_225628_4_, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
        }
    }
}