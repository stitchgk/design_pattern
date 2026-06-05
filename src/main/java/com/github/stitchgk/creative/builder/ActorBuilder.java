package com.github.stitchgk.creative.builder;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
abstract class ActorBuilder {
    protected Actor actor = new Actor();
    abstract void buildType();
    abstract void buildSex();
    abstract void buildFace();
    abstract void buildHairStyle();
    abstract void buildCostume();

    public Actor createActor() {
        return actor;
    }
}
