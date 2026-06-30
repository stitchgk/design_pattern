package com.github.stitchgk.behavior.observer;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class ObserverTest {

    @Test
    public void test() {
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

        Observer player1, player2, player3, player4;
        player1 = new Player("小龙女");
        acc.join(player1);
        player2 = new Player("张无忌");
        acc.join(player2);
        player3 = new Player("段誉");
        acc.join(player3);
        player4 = new Player("小五郎");
        acc.join(player4);

        player1.beAttacked(acc);
    }

}
