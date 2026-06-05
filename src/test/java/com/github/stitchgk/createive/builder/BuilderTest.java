package com.github.stitchgk.createive.builder;

import com.github.stitchgk.creative.builder.Actor;
import com.github.stitchgk.creative.builder.ActorController;
import com.github.stitchgk.creative.builder.HeroBuilder;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class BuilderTest {

    @Test
    public void test() {
        ActorController actorController = new ActorController();
        Actor hero = actorController.constructor(new HeroBuilder());
        System.out.println(hero);
    }

}
