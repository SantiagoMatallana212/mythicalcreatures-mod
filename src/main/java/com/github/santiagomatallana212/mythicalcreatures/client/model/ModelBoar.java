package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.santiagomatallana212.mythicalcreatures.entity.EntityBoar;
import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

public class ModelBoar extends AdvancedEntityModel<EntityBoar> {
    private final AdvancedModelBox root;
    private final AdvancedModelBox head;
    private final AdvancedModelBox jowl;
    private final AdvancedModelBox headWakeUp;
    private final AdvancedModelBox headSleeping;
    private final AdvancedModelBox upperJaw;
    private final AdvancedModelBox lowerJaw;
    private final AdvancedModelBox rightTusk;
    private final AdvancedModelBox leftTusk;
    private final AdvancedModelBox chin;
    private final AdvancedModelBox rightEar;
    private final AdvancedModelBox leftEar;
    private final AdvancedModelBox body;
    private final AdvancedModelBox tail;
    private final AdvancedModelBox tailUpper;
    private final AdvancedModelBox tailLower;
    private final AdvancedModelBox rightBackLeg;
    private final AdvancedModelBox rightBackLeg0;
    private final AdvancedModelBox leftBackLeg;
    private final AdvancedModelBox leftBackLeg0;
    private final AdvancedModelBox rightFrontLeg;
    private final AdvancedModelBox rightFrontLegUpper;
    private final AdvancedModelBox rightFrontLegLower;
    private final AdvancedModelBox leftFrontLeg;
    private final AdvancedModelBox leftFrontLegUpper;
    private final AdvancedModelBox leftFrontLegLower;

    public ModelBoar() {
        texWidth = 128;
        texHeight = 128;

        root = new AdvancedModelBox(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        head = new AdvancedModelBox(this);
        head.setPos(0.0F, -20.0F, -13.0F);
        root.addChild(head);


        jowl = new AdvancedModelBox(this);
        jowl.setPos(1.0F, -8.0F, 0.0F);
        head.addChild(jowl);
        setRotationAngle(jowl, 0.1745F, 0.0F, 0.0F);
        jowl.setTextureOffset(0, 90).addBox(-7.0F, 5.0F, -9.0F, 12.0F, 7.0F, 10.0F, 0.5F, false);

        headWakeUp = new AdvancedModelBox(this);
        headWakeUp.setPos(0.0F, 0.0F, 0.0F);
        jowl.addChild(headWakeUp);
        headWakeUp.setTextureOffset(44, 44).addBox(-7.0F, 0.0F, -10.0F, 12.0F, 12.0F, 10.0F, 0.0F, false);

        headSleeping = new AdvancedModelBox(this);
        headSleeping.setPos(0.0F, 0.0F, 0.0F);
        jowl.addChild(headSleeping);
        headSleeping.setTextureOffset(84, 16).addBox(-7.0F, 0.0F, -10.0F, 12.0F, 12.0F, 10.0F, 0.0F, false);

        upperJaw = new AdvancedModelBox(this);
        upperJaw.setPos(-1.0F, 7.0F, -10.0F);
        jowl.addChild(upperJaw);
        upperJaw.setTextureOffset(54, 0).addBox(-3.0F, -3.0F, -9.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);

        lowerJaw = new AdvancedModelBox(this);
        lowerJaw.setPos(-1.0F, 11.0F, -10.0F);
        jowl.addChild(lowerJaw);
        lowerJaw.setTextureOffset(26, 42).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);

        rightTusk = new AdvancedModelBox(this);
        rightTusk.setPos(-2.0F, 0.0F, -5.0F);
        lowerJaw.addChild(rightTusk);
        setRotationAngle(rightTusk, 0.0F, 0.0F, -0.2618F);
        rightTusk.setTextureOffset(0, 83).addBox(-2.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leftTusk = new AdvancedModelBox(this);
        leftTusk.setPos(2.0F, 0.0F, -5.0F);
        lowerJaw.addChild(leftTusk);
        setRotationAngle(leftTusk, 0.0F, 0.0F, 0.2618F);
        leftTusk.setTextureOffset(0, 83).addBox(0.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        chin = new AdvancedModelBox(this);
        chin.setPos(0.0F, -3.0F, 0.0F);
        jowl.addChild(chin);
        setRotationAngle(chin, 0.0873F, 0.0F, 0.0F);
        chin.setTextureOffset(24, 64).addBox(-3.0F, 0.0F, -10.5F, 4.0F, 4.0F, 10.0F, 0.0F, false);

        rightEar = new AdvancedModelBox(this);
        rightEar.setPos(-4.0F, 0.0F, -3.0F);
        jowl.addChild(rightEar);
        setRotationAngle(rightEar, 0.0F, 0.0F, -0.3491F);
        rightEar.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);

        leftEar = new AdvancedModelBox(this);
        leftEar.setPos(2.0F, 0.0F, -3.0F);
        jowl.addChild(leftEar);
        setRotationAngle(leftEar, 0.0F, 0.0F, 0.3491F);
        leftEar.setTextureOffset(0, 0).addBox(0.0F, -5.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);

        body = new AdvancedModelBox(this);
        body.setPos(0.0F, -28.0F, -13.0F);
        root.addChild(body);
        setRotationAngle(body, -0.0873F, 0.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-7.0F, 0.0F, 0.0F, 14.0F, 16.0F, 26.0F, 0.0F, false);
        body.setTextureOffset(0, 42).addBox(-2.0F, -2.7063F, -1.2216F, 4.0F, 4.0F, 18.0F, 0.0F, false);

        tail = new AdvancedModelBox(this);
        tail.setPos(0.0F, 2.0F, 25.0F);
        body.addChild(tail);


        tailUpper = new AdvancedModelBox(this);
        tailUpper.setPos(0.0F, 0.0F, 0.0F);
        tail.addChild(tailUpper);
        setRotationAngle(tailUpper, 0.3491F, 0.0F, 0.0F);
        tailUpper.setTextureOffset(54, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        tailLower = new AdvancedModelBox(this);
        tailLower.setPos(0.0F, 8.0F, 0.0F);
        tailUpper.addChild(tailLower);
        setRotationAngle(tailLower, 0.2618F, 0.0F, 0.0F);
        tailLower.setTextureOffset(24, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        tailLower.setTextureOffset(54, 16).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);

        rightBackLeg = new AdvancedModelBox(this);
        rightBackLeg.setPos(-6.0F, -17.0F, 10.0F);
        root.addChild(rightBackLeg);
        rightBackLeg.setTextureOffset(0, 19).addBox(-2.0F, 15.4462F, -3.8493F, 4.0F, 2.0F, 4.0F, 0.1F, false);

        rightBackLeg0 = new AdvancedModelBox(this);
        rightBackLeg0.setPos(0.0F, 0.0F, 1.0F);
        rightBackLeg.addChild(rightBackLeg0);
        setRotationAngle(rightBackLeg0, -0.4363F, 0.0F, 0.0F);
        rightBackLeg0.setTextureOffset(0, 64).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 11.0F, 8.0F, 0.1F, false);
        rightBackLeg0.setTextureOffset(52, 66).addBox(-2.0F, 6.0F, 2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

        leftBackLeg = new AdvancedModelBox(this);
        leftBackLeg.setPos(6.0F, -17.0F, 10.0F);
        root.addChild(leftBackLeg);
        leftBackLeg.setTextureOffset(26, 52).addBox(-2.0F, 15.4462F, -3.8493F, 4.0F, 2.0F, 4.0F, 0.1F, false);

        leftBackLeg0 = new AdvancedModelBox(this);
        leftBackLeg0.setPos(0.0F, 0.0F, 1.0F);
        leftBackLeg.addChild(leftBackLeg0);
        setRotationAngle(leftBackLeg0, -0.4363F, 0.0F, 0.0F);
        leftBackLeg0.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 11.0F, 8.0F, 0.1F, false);
        leftBackLeg0.setTextureOffset(0, 42).addBox(-2.0F, 6.0F, 2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

        rightFrontLeg = new AdvancedModelBox(this);
        rightFrontLeg.setPos(-6.0F, -15.0F, -9.0F);
        root.addChild(rightFrontLeg);


        rightFrontLegUpper = new AdvancedModelBox(this);
        rightFrontLegUpper.setPos(0.0F, 8.0F, 1.0F);
        rightFrontLeg.addChild(rightFrontLegUpper);
        setRotationAngle(rightFrontLegUpper, 0.1745F, 0.0F, 0.0F);
        rightFrontLegUpper.setTextureOffset(68, 68).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

        rightFrontLegLower = new AdvancedModelBox(this);
        rightFrontLegLower.setPos(0.0F, 7.0F, 1.0F);
        rightFrontLeg.addChild(rightFrontLegLower);
        rightFrontLegLower.setTextureOffset(78, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        leftFrontLeg = new AdvancedModelBox(this);
        leftFrontLeg.setPos(6.0F, -15.0F, -9.0F);
        root.addChild(leftFrontLeg);


        leftFrontLegUpper = new AdvancedModelBox(this);
        leftFrontLegUpper.setPos(0.0F, 8.0F, 1.0F);
        leftFrontLeg.addChild(leftFrontLegUpper);
        setRotationAngle(leftFrontLegUpper, 0.1745F, 0.0F, 0.0F);
        leftFrontLegUpper.setTextureOffset(68, 68).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

        leftFrontLegLower = new AdvancedModelBox(this);
        leftFrontLegLower.setPos(0.0F, 7.0F, 1.0F);
        leftFrontLeg.addChild(leftFrontLegLower);
        leftFrontLegLower.setTextureOffset(78, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        this.updateDefaultPose();
    }

    @Override
    public Iterable<BasicModelPart> parts() {
        return ImmutableList.of(root);
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(root,
                head,
                jowl,
                headWakeUp,
                headSleeping,
                upperJaw,
                lowerJaw,
                rightTusk,
                leftTusk,
                chin,
                rightEar,
                leftEar,
                body,
                tail,
                tailUpper,
                tailLower,
                rightBackLeg,
                rightBackLeg0,
                leftBackLeg,
                leftBackLeg0,
                rightFrontLeg,
                rightFrontLegUpper,
                rightFrontLegLower,
                leftFrontLeg,
                leftFrontLegUpper,
                leftFrontLegLower
        );
    }

    @Override
    public void setupAnim(EntityBoar entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.resetToDefaultPose();
        animate(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4) {
        this.resetToDefaultPose();
    }

    /*public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        if (this.young) {
            float scale = 0.5F;
            matrixStackIn.pushPose();
            matrixStackIn.scale(scale, scale, scale);
            matrixStackIn.translate(0.0D, 0.0D,0.0D);
            parts().forEach((p_228292_8_) -> {
                p_228292_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
        }else {
            parts().forEach((p_228292_8_) -> {
                p_228292_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            });
        }
        matrixStackIn.popPose();
    }*/

    public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
        AdvancedModelBox.rotateAngleX = x;
        AdvancedModelBox.rotateAngleY = y;
        AdvancedModelBox.rotateAngleZ = z;
    }
}
