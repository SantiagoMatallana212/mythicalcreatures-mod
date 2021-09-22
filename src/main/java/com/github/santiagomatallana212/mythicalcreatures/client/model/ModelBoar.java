package com.github.santiagomatallana212.mythicalcreatures.client.model;

import com.github.santiagomatallana212.mythicalcreatures.entity.EntityBoar;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBoar<T extends EntityBoar> extends AgeableModel<T> {
    private final ModelRenderer root;
    private final ModelRenderer head;
    private final ModelRenderer jowl;
    private final ModelRenderer headWakeUp;
    private final ModelRenderer headSleeping;
    private final ModelRenderer upperJaw;
    private final ModelRenderer lowerJaw;
    private final ModelRenderer rightTusk;
    private final ModelRenderer leftTusk;
    private final ModelRenderer chin;
    private final ModelRenderer rightEar;
    private final ModelRenderer leftEar;
    private final ModelRenderer body;
    private final ModelRenderer tail;
    private final ModelRenderer tailUpper;
    private final ModelRenderer tailLower;
    private final ModelRenderer rightBackLeg;
    private final ModelRenderer rightBackLeg0;
    private final ModelRenderer leftBackLeg;
    private final ModelRenderer leftBackLeg0;
    private final ModelRenderer rightFrontLeg;
    private final ModelRenderer rightFrontLegUpper;
    private final ModelRenderer rightFrontLegLower;
    private final ModelRenderer leftFrontLeg;
    private final ModelRenderer leftFrontLegUpper;
    private final ModelRenderer leftFrontLegLower;

    public ModelBoar() {
        texWidth = 128;
        texHeight = 128;

        root = new ModelRenderer(this);
        root.setPos(0.0F, 24.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setPos(0.0F, -20.0F, -13.0F);
        root.addChild(head);


        jowl = new ModelRenderer(this);
        jowl.setPos(1.0F, -8.0F, 0.0F);
        head.addChild(jowl);
        setRotateAngle(jowl, 0.1745F, 0.0F, 0.0F);
        jowl.texOffs(0, 90).addBox(-7.0F, 5.0F, -9.0F, 12.0F, 7.0F, 10.0F, 0.5F, false);

        headWakeUp = new ModelRenderer(this);
        headWakeUp.setPos(0.0F, 0.0F, 0.0F);
        jowl.addChild(headWakeUp);
        headWakeUp.texOffs(44, 44).addBox(-7.0F, 0.0F, -10.0F, 12.0F, 12.0F, 10.0F, 0.0F, false);

        headSleeping = new ModelRenderer(this);
        headSleeping.setPos(0.0F, 0.0F, 0.0F);
        jowl.addChild(headSleeping);
        headSleeping.texOffs(84, 16).addBox(-7.0F, 0.0F, -10.0F, 12.0F, 12.0F, 10.0F, 0.0F, false);

        upperJaw = new ModelRenderer(this);
        upperJaw.setPos(-1.0F, 7.0F, -10.0F);
        jowl.addChild(upperJaw);
        upperJaw.texOffs(54, 0).addBox(-3.0F, -3.0F, -9.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);

        lowerJaw = new ModelRenderer(this);
        lowerJaw.setPos(-1.0F, 11.0F, -10.0F);
        jowl.addChild(lowerJaw);
        lowerJaw.texOffs(26, 42).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);

        rightTusk = new ModelRenderer(this);
        rightTusk.setPos(-2.0F, 0.0F, -5.0F);
        lowerJaw.addChild(rightTusk);
        setRotateAngle(rightTusk, 0.0F, 0.0F, -0.2618F);
        rightTusk.texOffs(0, 83).addBox(-2.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leftTusk = new ModelRenderer(this);
        leftTusk.setPos(2.0F, 0.0F, -5.0F);
        lowerJaw.addChild(leftTusk);
        setRotateAngle(leftTusk, 0.0F, 0.0F, 0.2618F);
        leftTusk.texOffs(0, 83).addBox(0.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        chin = new ModelRenderer(this);
        chin.setPos(0.0F, -3.0F, 0.0F);
        jowl.addChild(chin);
        setRotateAngle(chin, 0.0873F, 0.0F, 0.0F);
        chin.texOffs(24, 64).addBox(-3.0F, 0.0F, -10.5F, 4.0F, 4.0F, 10.0F, 0.0F, false);

        rightEar = new ModelRenderer(this);
        rightEar.setPos(-4.0F, 0.0F, -3.0F);
        jowl.addChild(rightEar);
        setRotateAngle(rightEar, 0.0F, 0.0F, -0.3491F);
        rightEar.texOffs(0, 0).addBox(-3.0F, -5.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);

        leftEar = new ModelRenderer(this);
        leftEar.setPos(2.0F, 0.0F, -3.0F);
        jowl.addChild(leftEar);
        setRotateAngle(leftEar, 0.0F, 0.0F, 0.3491F);
        leftEar.texOffs(0, 0).addBox(0.0F, -5.0F, -1.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, -28.0F, -13.0F);
        root.addChild(body);
        setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        body.texOffs(0, 0).addBox(-7.0F, 0.0F, 0.0F, 14.0F, 16.0F, 26.0F, 0.0F, false);
        body.texOffs(0, 42).addBox(-2.0F, -2.7063F, -1.2216F, 4.0F, 4.0F, 18.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setPos(0.0F, 2.0F, 25.0F);
        body.addChild(tail);


        tailUpper = new ModelRenderer(this);
        tailUpper.setPos(0.0F, 0.0F, 0.0F);
        tail.addChild(tailUpper);
        setRotateAngle(tailUpper, 0.3491F, 0.0F, 0.0F);
        tailUpper.texOffs(54, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

        tailLower = new ModelRenderer(this);
        tailLower.setPos(0.0F, 8.0F, 0.0F);
        tailUpper.addChild(tailLower);
        setRotateAngle(tailLower, 0.2618F, 0.0F, 0.0F);
        tailLower.texOffs(24, 64).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        tailLower.texOffs(54, 16).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);

        rightBackLeg = new ModelRenderer(this);
        rightBackLeg.setPos(-6.0F, -17.0F, 10.0F);
        root.addChild(rightBackLeg);
        rightBackLeg.texOffs(0, 19).addBox(-2.0F, 15.4462F, -3.8493F, 4.0F, 2.0F, 4.0F, 0.1F, false);

        rightBackLeg0 = new ModelRenderer(this);
        rightBackLeg0.setPos(0.0F, 0.0F, 1.0F);
        rightBackLeg.addChild(rightBackLeg0);
        setRotateAngle(rightBackLeg0, -0.4363F, 0.0F, 0.0F);
        rightBackLeg0.texOffs(0, 64).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 11.0F, 8.0F, 0.1F, false);
        rightBackLeg0.texOffs(52, 66).addBox(-2.0F, 6.0F, 2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

        leftBackLeg = new ModelRenderer(this);
        leftBackLeg.setPos(6.0F, -17.0F, 10.0F);
        root.addChild(leftBackLeg);
        leftBackLeg.texOffs(26, 52).addBox(-2.0F, 15.4462F, -3.8493F, 4.0F, 2.0F, 4.0F, 0.1F, false);

        leftBackLeg0 = new ModelRenderer(this);
        leftBackLeg0.setPos(0.0F, 0.0F, 1.0F);
        leftBackLeg.addChild(leftBackLeg0);
        setRotateAngle(leftBackLeg0, -0.4363F, 0.0F, 0.0F);
        leftBackLeg0.texOffs(0, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 11.0F, 8.0F, 0.1F, false);
        leftBackLeg0.texOffs(0, 42).addBox(-2.0F, 6.0F, 2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

        rightFrontLeg = new ModelRenderer(this);
        rightFrontLeg.setPos(-6.0F, -15.0F, -9.0F);
        root.addChild(rightFrontLeg);


        rightFrontLegUpper = new ModelRenderer(this);
        rightFrontLegUpper.setPos(0.0F, 8.0F, 1.0F);
        rightFrontLeg.addChild(rightFrontLegUpper);
        setRotateAngle(rightFrontLegUpper, 0.1745F, 0.0F, 0.0F);
        rightFrontLegUpper.texOffs(68, 68).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

        rightFrontLegLower = new ModelRenderer(this);
        rightFrontLegLower.setPos(0.0F, 7.0F, 1.0F);
        rightFrontLeg.addChild(rightFrontLegLower);
        rightFrontLegLower.texOffs(78, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        leftFrontLeg = new ModelRenderer(this);
        leftFrontLeg.setPos(6.0F, -15.0F, -9.0F);
        root.addChild(leftFrontLeg);


        leftFrontLegUpper = new ModelRenderer(this);
        leftFrontLegUpper.setPos(0.0F, 8.0F, 1.0F);
        leftFrontLeg.addChild(leftFrontLegUpper);
        setRotateAngle(leftFrontLegUpper, 0.1745F, 0.0F, 0.0F);
        leftFrontLegUpper.texOffs(68, 68).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

        leftFrontLegLower = new ModelRenderer(this);
        leftFrontLegLower.setPos(0.0F, 7.0F, 1.0F);
        leftFrontLeg.addChild(leftFrontLegLower);
        leftFrontLegLower.texOffs(78, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    protected Iterable<ModelRenderer> headParts() {
        return ImmutableList.of(this.root);
    }

    @Override
    protected Iterable<ModelRenderer> bodyParts() {
        return ImmutableList.of(this.root);
    }

    private void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
