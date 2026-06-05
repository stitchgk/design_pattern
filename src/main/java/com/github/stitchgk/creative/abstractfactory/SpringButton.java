package com.github.stitchgk.creative.abstractfactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class SpringButton implements  Button{
    @Override
    public void display() {
        System.out.println("浅绿色按钮");
    }
}
