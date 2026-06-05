package com.github.stitchgk.creative.abstractfactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("绿色边框文案");
    }
}
