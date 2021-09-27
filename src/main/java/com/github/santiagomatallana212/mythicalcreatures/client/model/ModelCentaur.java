package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.alexthe666.citadel.animation.IAnimatedEntity;
import com.github.alexthe666.citadel.client.model.AdvancedEntityModel;
import com.github.alexthe666.citadel.client.model.AdvancedModelBox;
import com.github.alexthe666.citadel.client.model.basic.BasicModelPart;
import com.github.santiagomatallana212.mythicalcreatures.entity.EntityCentaur;
import com.google.common.collect.ImmutableList;

public class ModelCentaur extends AdvancedEntityModel<EntityCentaur> {
    private final AdvancedModelBox root;
    private final AdvancedModelBox body;
    private final AdvancedModelBox tail;
    private final AdvancedModelBox rightBackLeg;
    private final AdvancedModelBox leftBackLeg;
    private final AdvancedModelBox rightFrontLeg;
    private final AdvancedModelBox leftFrontLeg;
    private final AdvancedModelBox torso;
    private final AdvancedModelBox head;
    private final AdvancedModelBox chin;
    private final AdvancedModelBox rightArm;
    private final AdvancedModelBox rightItem;
    private final AdvancedModelBox leftArm;

    public ModelCentaur() {
        texWidth = 128;
        texHeight = 64;

        root = new AdvancedModelBox(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        body = new AdvancedModelBox(this);
        body.setPos(0.0F, -11.0F, 8.0F);
        root.addChild(body);
        body.setTextureOffset(0, 32).addBox(-5.0F, -10.0F, -19.0F, 10.0F, 10.0F, 22.0F, 0.0F, false);

        tail = new AdvancedModelBox(this);
        tail.setPos(0.0F, -9.0F, 3.0F);
        body.addChild(tail);
        setRotateAngle(tail, 0.5236F, 0.0F, 0.0F);
        tail.setTextureOffset(42, 36).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);

        rightBackLeg = new AdvancedModelBox(this);
        rightBackLeg.setPos(-3.0F, 0.0F, 1.0F);
        body.addChild(rightBackLeg);
        rightBackLeg.setTextureOffset(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        leftBackLeg = new AdvancedModelBox(this);
        leftBackLeg.setPos(3.0F, 0.0F, 1.0F);
        body.addChild(leftBackLeg);
        leftBackLeg.setTextureOffset(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);

        rightFrontLeg = new AdvancedModelBox(this);
        rightFrontLeg.setPos(-3.0F, 0.0F, -17.0F);
        body.addChild(rightFrontLeg);
        rightFrontLeg.setTextureOffset(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);

        leftFrontLeg = new AdvancedModelBox(this);
        leftFrontLeg.setPos(3.0F, 0.0F, -17.0F);
        body.addChild(leftFrontLeg);
        leftFrontLeg.setTextureOffset(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, true);

        torso = new AdvancedModelBox(this);
        torso.setPos(0.0F, -10.0F, -17.0F);
        body.addChild(torso);
        torso.setTextureOffset(88, 0).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

        head = new AdvancedModelBox(this);
        head.setPos(0.0F, -12.0F, 0.0F);
        torso.addChild(head);
        head.setTextureOffset(56, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        chin = new AdvancedModelBox(this);
        chin.setPos(0.0F, 0.0F, 0.0F);
        head.addChild(chin);
        chin.setTextureOffset(67, 13).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 15.0F, 8.0F, 0.2F, false);

        rightArm = new AdvancedModelBox(this);
        rightArm.setPos(-5.0F, -12.0F, 0.0F);
        torso.addChild(rightArm);
        rightArm.setTextureOffset(112, 0).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        rightItem = new AdvancedModelBox(this);
        rightItem.setPos(-2.0F, 12.0F, 0.0F);
        rightArm.addChild(rightItem);


        leftArm = new AdvancedModelBox(this);
        leftArm.setPos(5.0F, -12.0F, 0.0F);
        torso.addChild(leftArm);
        leftArm.setTextureOffset(112, 0).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

        this.updateDefaultPose();
    }

    @Override
    public void setupAnim(EntityCentaur entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.resetToDefaultPose();
        animate(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
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
                body,
                tail,
                rightBackLeg,
                leftBackLeg,
                rightFrontLeg,
                leftFrontLeg,
                torso,
                head,
                chin,
                rightArm,
                rightItem,
                leftArm
        );
    }
}
