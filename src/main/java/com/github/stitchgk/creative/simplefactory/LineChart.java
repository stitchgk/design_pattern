package com.github.stitchgk.creative.simplefactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class LineChart implements  Chart{

    public LineChart() {
        System.out.println("创建条形图");
    }
    @Override
    public void display() {
        System.out.println("条形图 展示");
    }
}
