package com.github.stitchgk.behavior.strategy;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class VIPDiscount implements Discount {

    @Override
    public double calculate(double price) {
        return price * 0.5;
    }
}
