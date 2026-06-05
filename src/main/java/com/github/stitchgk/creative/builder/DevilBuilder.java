package com.github.stitchgk.creative.builder;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class DevilBuilder extends ActorBuilder{
    @Override
    void buildType() {
        actor.setType("恶魔");
    }

    @Override
    void buildSex() {
        actor.setSex("妖");
    }

    @Override
    void buildFace() {
        actor.setFace("丑");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("光头");
    }

    @Override
    void buildCostume() {
        actor.setCostume("黑衣");
    }
}
