package com.github.stitchgk.creative.builder;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class AngelBuilder extends ActorBuilder{
    @Override
    void buildType() {
        actor.setType("天使");
    }

    @Override
    void buildSex() {
        actor.setSex("女");
    }

    @Override
    void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("飘逸");
    }

    @Override
    void buildCostume() {
        actor.setCostume("白裙");
    }
}
