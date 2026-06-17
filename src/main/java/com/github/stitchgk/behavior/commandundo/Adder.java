package com.github.stitchgk.behavior.commandundo;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public class Adder {
    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }
}
