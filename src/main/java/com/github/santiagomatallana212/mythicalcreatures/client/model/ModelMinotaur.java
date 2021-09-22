package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.santiagomatallana212.mythicalcreatures.entity.EntityMinotaur;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelMinotaur<T extends EntityMinotaur> extends EntityModel<T> {
    private final ModelRenderer root;
    private final ModelRenderer head;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftHorn;
    private final ModelRenderer body;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLegRotation;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLegRotation;
    private final ModelRenderer rightArm;
    private final ModelRenderer weapon;
    private final ModelRenderer leftArm;

    public ModelMinotaur() {
        texWidth = 128;
        texHeight = 128;

        root = new ModelRenderer(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setPos(0.0F, -24.0F, 0.0F);
        root.addChild(head);
        head.texOffs(0, 0).addBox(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
        head.texOffs(29, 0).addBox(-3.0F, -5.5F, -10.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

        rightHorn = new ModelRenderer(this);
        rightHorn.setPos(-3.0F, -6.0F, 0.0F);
        head.addChild(rightHorn);
        setRotateAngle(rightHorn, 0.6109F, -0.1745F, 0.6109F);
        rightHorn.texOffs(60, 0).addBox(-3.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        rightHorn.texOffs(50, 0).addBox(-3.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, true);
        rightHorn.texOffs(73, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        leftHorn = new ModelRenderer(this);
        leftHorn.setPos(3.0F, -6.0F, 0.0F);
        head.addChild(leftHorn);
        setRotateAngle(leftHorn, 0.6109F, 0.1745F, -0.6109F);
        leftHorn.texOffs(60, 0).addBox(2.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        leftHorn.texOffs(50, 0).addBox(0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        leftHorn.texOffs(73, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, -15.0F, 2.0F);
        root.addChild(body);
        setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        body.texOffs(56, 0).addBox(-5.5F, -9.0571F, -5.8073F, 11.0F, 9.0F, 9.0F, 0.0F, false);
        body.texOffs(97, 0).addBox(-3.5F, -0.0571F, -4.8073F, 7.0F, 5.0F, 7.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setPos(-3.0F, -12.0F, 2.0F);
        root.addChild(rightLeg);
        rightLeg.texOffs(35, 24).addBox(-1.5F, 10.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        rightLegRotation = new ModelRenderer(this);
        rightLegRotation.setPos(-1.0F, 2.0F, -1.0F);
        rightLeg.addChild(rightLegRotation);
        setRotateAngle(rightLegRotation, -0.5236F, 0.0F, 0.0F);
        rightLegRotation.texOffs(34, 30).addBox(-1.0F, -1.866F, -0.768F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        rightLegRotation.texOffs(48, 23).addBox(0.0F, 4.134F, 3.2321F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setPos(3.0F, -12.0F, 2.0F);
        root.addChild(leftLeg);
        leftLeg.texOffs(35, 24).addBox(-1.5F, 10.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        leftLegRotation = new ModelRenderer(this);
        leftLegRotation.setPos(0.0F, 2.0F, -1.0F);
        leftLeg.addChild(leftLegRotation);
        setRotateAngle(leftLegRotation, -0.5236F, 0.0F, 0.0F);
        leftLegRotation.texOffs(34, 30).addBox(-2.0F, -1.866F, -0.768F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        leftLegRotation.texOffs(48, 23).addBox(-1.0F, 4.134F, 3.2321F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setPos(-5.0F, -23.0F, 2.0F);
        root.addChild(rightArm);
        rightArm.texOffs(0, 16).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

        weapon = new ModelRenderer(this);
        weapon.setPos(-2.0F, 12.0F, 3.5F);
        rightArm.addChild(weapon);
        setRotateAngle(weapon, 0.0F, -1.5708F, 0.0F);
        weapon.texOffs(18, 19).addBox(-23.0F, -0.5F, -0.5F, 31.0F, 1.0F, 1.0F, 0.0F, false);
        weapon.texOffs(0, 44).addBox(-22.0F, -5.5F, -2.5F, 6.0F, 11.0F, 5.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setPos(5.0F, -23.0F, 2.0F);
        root.addChild(leftArm);
        leftArm.texOffs(0, 16).addBox(0.0F, 0.0F, -3.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.root.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

    private void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
