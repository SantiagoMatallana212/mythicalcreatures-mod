package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.santiagomatallana212.mythicalcreatures.entity.EntityCentaur;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ModelCentaur<T extends EntityCentaur> extends EntityModel<T> {
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer tail;
    private final ModelRenderer rightBackLeg;
    private final ModelRenderer leftBackLeg;
    private final ModelRenderer rightFrontLeg;
    private final ModelRenderer leftFrontLeg;
    private final ModelRenderer torso;
    private final ModelRenderer head;
    private final ModelRenderer chin;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightItem;
    private final ModelRenderer leftArm;

    public ModelCentaur() {
        texWidth = 128;
        texHeight = 64;

        root = new ModelRenderer(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        body = new ModelRenderer(this);
        body.setPos(0.0F, -11.0F, 8.0F);
        root.addChild(body);
        body.texOffs(0, 32).addBox(-5.0F, -10.0F, -19.0F, 10.0F, 10.0F, 22.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, -9.0F, 3.0F);
        body.addChild(tail);
        setRotateAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.texOffs(42, 36).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);

        rightBackLeg = new ModelRenderer(this);
        rightBackLeg.setPos(-3.0F, 0.0F, 1.0F);
        body.addChild(rightBackLeg);
        rightBackLeg.texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        leftBackLeg = new ModelRenderer(this);
        leftBackLeg.setPos(3.0F, 0.0F, 1.0F);
        body.addChild(leftBackLeg);
        leftBackLeg.texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);

        rightFrontLeg = new ModelRenderer(this);
        rightFrontLeg.setPos(-3.0F, 0.0F, -17.0F);
        body.addChild(rightFrontLeg);
        rightFrontLeg.texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        leftFrontLeg = new ModelRenderer(this);
        leftFrontLeg.setPos(3.0F, 0.0F, -17.0F);
        body.addChild(leftFrontLeg);
        leftFrontLeg.texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);

        torso = new ModelRenderer(this);
        torso.setPos(0.0F, -10.0F, -17.0F);
        body.addChild(torso);
        torso.texOffs(88, 0).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, -12.0F, 0.0F);
        torso.addChild(head);
        head.texOffs(56, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        chin = new ModelRenderer(this);
        chin.setPos(0.0F, 0.0F, 0.0F);
        head.addChild(chin);
        chin.texOffs(67, 13).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 15.0F, 8.0F, 0.2F, false);

        rightArm = new ModelRenderer(this);
        rightArm.setPos(-5.0F, -12.0F, 0.0F);
        torso.addChild(rightArm);
        rightArm.texOffs(112, 0).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        rightItem = new ModelRenderer(this);
        rightItem.setPos(-2.0F, 12.0F, 0.0F);
        rightArm.addChild(rightItem);


        leftArm = new ModelRenderer(this);
        leftArm.setPos(5.0F, -12.0F, 0.0F);
        torso.addChild(leftArm);
        leftArm.texOffs(112, 0).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        this.head.xRot = p_225597_6_ * ((float)Math.PI / 180F);
        this.head.yRot = p_225597_5_ * ((float)Math.PI / 180F);
        this.rightBackLeg.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * 1.4F * p_225597_3_;
        this.leftBackLeg.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_225597_3_;
        this.rightFrontLeg.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_225597_3_;
        this.leftFrontLeg.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * 1.4F * p_225597_3_;
        this.rightArm.xRot = MathHelper.cos(p_225597_2_ * 0.6662F) * 1.4F * p_225597_3_;
        this.leftArm.xRot = MathHelper.cos(p_225597_2_ * 0.6662F + (float)Math.PI) * 1.4F * p_225597_3_;
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
