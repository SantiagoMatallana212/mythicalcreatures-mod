package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelCentaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.layers.CentaurMarkingLayers;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityCentaur;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.horse.CoatColors;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class RenderCentaur extends MobRenderer<EntityCentaur, ModelCentaur<EntityCentaur>> {
    private static final Map<CoatColors, ResourceLocation> LOCATION_BY_VARIANT = Util.make(Maps.newEnumMap(CoatColors.class), (p_239384_0_) -> {
        p_239384_0_.put(CoatColors.WHITE, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_white.png"));
        p_239384_0_.put(CoatColors.CREAMY, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_creamy.png"));
        p_239384_0_.put(CoatColors.CHESTNUT, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_chestnut.png"));
        p_239384_0_.put(CoatColors.BROWN, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_brown.png"));
        p_239384_0_.put(CoatColors.BLACK, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_black.png"));
        p_239384_0_.put(CoatColors.GRAY, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_gray.png"));
        p_239384_0_.put(CoatColors.DARKBROWN, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_darkbrown.png"));
    });

    public RenderCentaur(EntityRendererManager rendererManager) {
        super(rendererManager, new ModelCentaur(), 0.5F);
        this.addLayer(new CentaurMarkingLayers(this));
    }

    @Override
    public ResourceLocation getTextureLocation(EntityCentaur p_110775_1_) {
        return LOCATION_BY_VARIANT.get(p_110775_1_.getVariant());
    }
}
