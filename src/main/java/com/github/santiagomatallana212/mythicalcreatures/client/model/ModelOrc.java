package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityOrc;
import com.google.common.collect.ImmutableList;

public class ModelOrc extends AdvancedEntityModel<EntityOrc> {
    private final AdvancedModelBox body;
    private final AdvancedModelBox head;
    private final AdvancedModelBox rightEar;
    private final AdvancedModelBox leftEar;
    private final AdvancedModelBox jaw;
    private final AdvancedModelBox rightTusk;
    private final AdvancedModelBox leftTusk;
    private final AdvancedModelBox rightArm;
    private final AdvancedModelBox leftArm;
    private final AdvancedModelBox rightLeg;
    private final AdvancedModelBox leftLeg;

    public ModelOrc() {
        texWidth = 128;
        texHeight = 128;

        body = new AdvancedModelBox(this);
        body.setPos(0.0F, 1.0F, 0.0F);
        body.setTextureOffset(80, 0).addBox(-6.0F, -11.0F, -4.0F, 12.0F, 22.0F, 10.0F, 0.0F, false);

        head = new AdvancedModelBox(this);
        head.setPos(0.0F, -9.0F, -4.0F);
        body.addChild(head);
        head.setTextureOffset(0, 14).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(7, 18).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

        rightEar = new AdvancedModelBox(this);
        rightEar.setPos(-4.0F, -6.0F, -3.0F);
        head.addChild(rightEar);
        this.setRotateAngle(rightEar, 0.0F, 0.8727F, 0.0F);
        rightEar.setTextureOffset(0, 4).addBox(-4.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, true);

        leftEar = new AdvancedModelBox(this);
        leftEar.setPos(4.0F, -6.0F, -3.0F);
        head.addChild(leftEar);
        setRotateAngle(leftEar, 0.0F, -0.8727F, 0.0F);
        leftEar.setTextureOffset(0, 4).addBox(0.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);

        jaw = new AdvancedModelBox(this);
        jaw.setPos(0.0F, -3.0F, 4.0F);
        head.addChild(jaw);
        jaw.setTextureOffset(1, 1).addBox(-4.0F, 0.0F, -9.0F, 8.0F, 3.0F, 9.0F, 0.0F, false);
        jaw.setTextureOffset(0, 30).addBox(-3.5F, -1.0F, -8.5F, 7.0F, 1.0F, 8.0F, 0.0F, false);

        rightTusk = new AdvancedModelBox(this);
        rightTusk.setPos(-3.5F, 0.0F, -9.5F);
        jaw.addChild(rightTusk);
        setRotateAngle(rightTusk, 0.5236F, 0.0F, -0.1745F);
        rightTusk.setTextureOffset(40, 0).addBox(-0.5F, -2.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        leftTusk = new AdvancedModelBox(this);
        leftTusk.setPos(3.5F, 0.0F, -9.5F);
        jaw.addChild(leftTusk);
        setRotateAngle(leftTusk, 0.5236F, 0.0F, 0.1745F);
        leftTusk.setTextureOffset(40, 0).addBox(-0.5F, -2.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        rightArm = new AdvancedModelBox(this);
        rightArm.setPos(-7.0F, -8.0F, 1.0F);
        body.addChild(rightArm);
        rightArm.setTextureOffset(55, 0).addBox(-5.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, 0.0F, true);

        leftArm = new AdvancedModelBox(this);
        leftArm.setPos(7.0F, -8.0F, 1.0F);
        body.addChild(leftArm);
        leftArm.setTextureOffset(55, 0).addBox(-1.0F, 0.0F, -3.0F, 6.0F, 21.0F, 6.0F, 0.0F, false);

        rightLeg = new AdvancedModelBox(this);
        rightLeg.setPos(-3.0F, 11.0F, 0.0F);
        body.addChild(rightLeg);
        rightLeg.setTextureOffset(33, 14).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);

        leftLeg = new AdvancedModelBox(this);
        leftLeg.setPos(3.0F, 11.0F, 0.0F);
        body.addChild(leftLeg);
        leftLeg.setTextureOffset(33, 14).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, true);

        this.updateDefaultPose();
    }

    @Override
    public void setupAnim(EntityOrc entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.resetToDefaultPose();
        animate(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        this.head.rotateAngleX += headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY += netHeadYaw * ((float)Math.PI / 180F);

        //limbSwing = entityIn.tickCount;
        //limbSwingAmount = 0.5F;

        float walkSpeed = 1;
        float walkDegree = 1;
        
        walk(rightArm, 0.5F * walkSpeed, 1 * walkDegree, false, 0, 0, limbSwing, limbSwingAmount);
        walk(leftArm, 0.5F * walkSpeed, 1 * walkDegree, true, 0, 0, limbSwing, limbSwingAmount);
        walk(rightLeg, 0.5F * walkSpeed, 1 * walkDegree, true, 0, 0, limbSwing, limbSwingAmount);
        walk(leftLeg, 0.5F * walkSpeed, 1 * walkDegree, false, 0, 0, limbSwing, limbSwingAmount);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4) {
        this.resetToDefaultPose();
    }

    @Override
    public Iterable<BasicModelPart> parts() {
        return ImmutableList.of(body);
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(body,
                head,rightEar,
                leftEar,
                jaw,
                rightTusk,
                leftTusk,
                rightArm,
                leftArm,
                rightLeg,
                leftLeg
        );
    }
}
