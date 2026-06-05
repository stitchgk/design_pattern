package com.github.stitchgk.creative.builder;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class ActorController {

    public Actor constructor(ActorBuilder ab) {
        Actor actor = null;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildHairStyle();
        ab.buildCostume();
        actor = ab.createActor();
        return actor;
    }

}
