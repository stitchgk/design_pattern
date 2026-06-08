package com.github.stitchgk.composite.flyweight;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class FlyWeightTest {

    @Test
    public void test() {
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        IgoChessman black1, black2, black3, white1, white2, white3;
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("两颗黑色棋子是否相同:" + (black1 == black2));
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        white3 = factory.getIgoChessman("w");
        System.out.println("两颗白色棋子是否相同:" + (white1 == white2));

        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        black3.display(new Coordinates(1, 3));
        white1.display(new Coordinates(1,3));
        white2.display(new Coordinates(2,5));
        white3.display(new Coordinates(2,4));

    }
}
