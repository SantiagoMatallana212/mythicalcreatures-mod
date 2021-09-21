package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.santiagomatallana212.mythicalcreatures.entity.EntityOrc;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelOrc<T extends EntityOrc> extends AgeableModel<T> {
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer rightEar;
    private final ModelRenderer leftEar;
    private final ModelRenderer jaw;
    private final ModelRenderer rightTusk;
    private final ModelRenderer leftTusk;
    private final ModelRenderer rightArm;
    private final ModelRenderer leftArm;
    private final ModelRenderer rightLeg;
    private final ModelRenderer leftLeg;

    public ModelOrc() {
        texWidth = 128;
        texHeight = 128;

        body = new ModelRenderer(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        body.texOffs(80, 0).addBox(-6.0F, -11.0F, -4.0F, 12.0F, 22.0F, 10.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -9.0F, -4.0F);
        body.addChild(head);
        head.texOffs(0, 14).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.texOffs(7, 18).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

        rightEar = new ModelRenderer(this);
        rightEar.setPos(-4.0F, -6.0F, -3.0F);
        head.addChild(rightEar);
        this.setRotateAngle(rightEar, 0.0F, 0.8727F, 0.0F);
        rightEar.texOffs(0, 4).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, true);

        leftEar = new ModelRenderer(this);
        leftEar.setPos(4.0F, -6.0F, -3.0F);
        head.addChild(leftEar);
        setRotateAngle(leftEar, 0.0F, -0.8727F, 0.0F);
        leftEar.texOffs(0, 4).addBox(0.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setPos(0.0F, -3.0F, 4.0F);
        head.addChild(jaw);
        jaw.texOffs(1, 1).addBox(-4.0F, 0.0F, -9.0F, 8.0F, 3.0F, 9.0F, 0.0F, false);
        jaw.texOffs(0, 30).addBox(-3.5F, -1.0F, -8.5F, 7.0F, 1.0F, 8.0F, 0.0F, false);

        rightTusk = new ModelRenderer(this);
        rightTusk.setPos(-3.5F, 0.0F, -9.5F);
        jaw.addChild(rightTusk);
        setRotateAngle(rightTusk, 0.5236F, 0.0F, -0.1745F);
        rightTusk.texOffs(40, 0).addBox(-0.5F, -2.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftTusk = new ModelRenderer(this);
        leftTusk.setPos(3.5F, 0.0F, -9.5F);
        jaw.addChild(leftTusk);
        setRotateAngle(leftTusk, 0.5236F, 0.0F, 0.1745F);
        leftTusk.texOffs(40, 0).addBox(-0.5F, -2.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setPos(-7.0F, -8.0F, 1.0F);
        body.addChild(rightArm);
        rightArm.texOffs(55, 0).addBox(-5.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, 0.0F, true);

        leftArm = new ModelRenderer(this);
        leftArm.setPos(7.0F, -8.0F, 1.0F);
        body.addChild(leftArm);
        leftArm.texOffs(55, 0).addBox(-1.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setPos(-3.0F, 11.0F, 0.0F);
        body.addChild(rightLeg);
        rightLeg.texOffs(33, 14).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setPos(3.0F, 11.0F, 0.0F);
        body.addChild(leftLeg);
        leftLeg.texOffs(33, 14).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, true);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(this.head);
    }

    @Override
    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of(this.body);
    }

    private void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
    private void setTextureOffset(ModelRenderer modelRenderer, float x, float y) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
    }
}
