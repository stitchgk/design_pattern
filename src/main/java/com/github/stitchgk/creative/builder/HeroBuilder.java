package com.github.stitchgk.creative.builder;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class HeroBuilder extends ActorBuilder{
    @Override
    void buildType() {
        actor.setType("英雄");
    }

    @Override
    void buildSex() {
        actor.setSex("男");
    }

    @Override
    void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("飘逸");
    }

    @Override
    void buildCostume() {
        actor.setCostume("盔甲");
    }
}
