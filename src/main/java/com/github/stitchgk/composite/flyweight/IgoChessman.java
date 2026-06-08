package com.github.stitchgk.composite.flyweight;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
abstract class IgoChessman {
    abstract String getColor();

    void display(Coordinates coordinates) {
        System.out.println("棋子颜色: " + this.getColor() + ", 棋子位置: " + coordinates.getX() + ", " + coordinates.getY());
    }
}
