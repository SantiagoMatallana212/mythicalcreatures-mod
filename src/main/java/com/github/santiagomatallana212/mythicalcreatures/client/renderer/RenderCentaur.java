package com.github.santiagomatallana212.mythicalcreatures.client.renderer;

import com.github.santiagomatallana212.mythicalcreatures.client.model.ModelCentaur;
import com.github.santiagomatallana212.mythicalcreatures.client.renderer.layers.CentaurMarkingLayers;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityCentaur;
import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Variant;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class RenderCentaur extends MobRenderer<EntityCentaur, ModelCentaur> {
    private static final Map<Variant, ResourceLocation> LOCATION_BY_VARIANT = Util.make(Maps.newEnumMap(Variant.class), (p_114874_) -> {
        p_114874_.put(Variant.WHITE, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_white.png"));
        p_114874_.put(Variant.CREAMY, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_creamy.png"));
        p_114874_.put(Variant.CHESTNUT, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_chestnut.png"));
        p_114874_.put(Variant.BROWN, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_brown.png"));
        p_114874_.put(Variant.BLACK, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_black.png"));
        p_114874_.put(Variant.GRAY, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_gray.png"));
        p_114874_.put(Variant.DARKBROWN, new ResourceLocation("mythicalcreatures:textures/entity/centaurs/centaur_darkbrown.png"));
    });

    public RenderCentaur(EntityRendererProvider.Context rendererManager) {
        super(rendererManager, new ModelCentaur(), 0.5F);
        this.addLayer(new CentaurMarkingLayers(this));
    }

    @Override
    public ResourceLocation getTextureLocation(EntityCentaur p_110775_1_) {
        return LOCATION_BY_VARIANT.get(p_110775_1_.getVariant());
    }
}
