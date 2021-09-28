package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityMinotaur;
import com.google.common.collect.ImmutableList;

public class ModelMinotaur extends AdvancedEntityModel<EntityMinotaur> {
    private final AdvancedModelBox root;
    private final AdvancedModelBox head;
    private final AdvancedModelBox rightHorn;
    private final AdvancedModelBox leftHorn;
    private final AdvancedModelBox body;
    private final AdvancedModelBox rightLeg;
    private final AdvancedModelBox rightLegRotation;
    private final AdvancedModelBox leftLeg;
    private final AdvancedModelBox leftLegRotation;
    private final AdvancedModelBox rightArm;
    private final AdvancedModelBox weapon;
    private final AdvancedModelBox leftArm;

    public ModelMinotaur() {
        texWidth = 128;
        texHeight = 128;

        root = new AdvancedModelBox(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        head = new AdvancedModelBox(this);
        head.setPos(0.0F, -24.0F, 0.0F);
        root.addChild(head);
        head.setTextureOffset(0, 0).addBox(-3.5F, -7.0F, -4.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
        head.setTextureOffset(29, 0).addBox(-3.0F, -5.5F, -10.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

        rightHorn = new AdvancedModelBox(this);
        rightHorn.setPos(-3.0F, -6.0F, 0.0F);
        head.addChild(rightHorn);
        setRotateAngle(rightHorn, 0.6109F, -0.1745F, 0.6109F);
        rightHorn.setTextureOffset(60, 0).addBox(-3.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        rightHorn.setTextureOffset(50, 0).addBox(-3.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, true);
        rightHorn.setTextureOffset(73, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        leftHorn = new AdvancedModelBox(this);
        leftHorn.setPos(3.0F, -6.0F, 0.0F);
        head.addChild(leftHorn);
        setRotateAngle(leftHorn, 0.6109F, 0.1745F, -0.6109F);
        leftHorn.setTextureOffset(60, 0).addBox(2.5F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        leftHorn.setTextureOffset(50, 0).addBox(0.5F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        leftHorn.setTextureOffset(73, 8).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        body = new AdvancedModelBox(this);
        body.setPos(0.0F, -15.0F, 2.0F);
        root.addChild(body);
        setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        body.setTextureOffset(56, 0).addBox(-5.5F, -9.0571F, -5.8073F, 11.0F, 9.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(97, 0).addBox(-3.5F, -0.0571F, -4.8073F, 7.0F, 5.0F, 7.0F, 0.0F, false);

        rightLeg = new AdvancedModelBox(this);
        rightLeg.setPos(-3.0F, -12.0F, 2.0F);
        root.addChild(rightLeg);
        rightLeg.setTextureOffset(35, 24).addBox(-1.5F, 10.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        rightLegRotation = new AdvancedModelBox(this);
        rightLegRotation.setPos(-1.0F, 2.0F, -1.0F);
        rightLeg.addChild(rightLegRotation);
        setRotateAngle(rightLegRotation, -0.5236F, 0.0F, 0.0F);
        rightLegRotation.setTextureOffset(34, 30).addBox(-1.0F, -1.866F, -0.768F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        rightLegRotation.setTextureOffset(48, 23).addBox(0.0F, 4.134F, 3.2321F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leftLeg = new AdvancedModelBox(this);
        leftLeg.setPos(3.0F, -12.0F, 2.0F);
        root.addChild(leftLeg);
        leftLeg.setTextureOffset(35, 24).addBox(-1.5F, 10.0F, -2.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

        leftLegRotation = new AdvancedModelBox(this);
        leftLegRotation.setPos(0.0F, 2.0F, -1.0F);
        leftLeg.addChild(leftLegRotation);
        setRotateAngle(leftLegRotation, -0.5236F, 0.0F, 0.0F);
        leftLegRotation.setTextureOffset(34, 30).addBox(-2.0F, -1.866F, -0.768F, 4.0F, 7.0F, 4.0F, 0.0F, false);
        leftLegRotation.setTextureOffset(48, 23).addBox(-1.0F, 4.134F, 3.2321F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        rightArm = new AdvancedModelBox(this);
        rightArm.setPos(-5.0F, -23.0F, 2.0F);
        root.addChild(rightArm);
        rightArm.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

        weapon = new AdvancedModelBox(this);
        weapon.setPos(-2.0F, 12.0F, 3.5F);
        rightArm.addChild(weapon);
        setRotateAngle(weapon, 0.0F, -1.5708F, 0.0F);
        weapon.setTextureOffset(18, 19).addBox(-23.0F, -0.5F, -0.5F, 31.0F, 1.0F, 1.0F, 0.0F, false);
        weapon.setTextureOffset(0, 44).addBox(-22.0F, -5.5F, -2.5F, 6.0F, 11.0F, 5.0F, 0.0F, false);

        leftArm = new AdvancedModelBox(this);
        leftArm.setPos(5.0F, -23.0F, 2.0F);
        root.addChild(leftArm);
        leftArm.setTextureOffset(0, 16).addBox(0.0F, 0.0F, -3.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

        this.updateDefaultPose();
    }

    @Override
    public void setupAnim(EntityMinotaur entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
        return ImmutableList.of(root);
    }

    @Override
    public Iterable<AdvancedModelBox> getAllParts() {
        return ImmutableList.of(root,
                head,
                rightHorn,
                leftHorn,
                body,
                rightLeg,
                rightLegRotation,
                leftLeg,
                leftLegRotation,rightArm,
                weapon,
                leftArm
        );
    }
}
