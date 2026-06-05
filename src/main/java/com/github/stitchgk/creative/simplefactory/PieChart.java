package com.github.stitchgk.creative.simplefactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class PieChart implements  Chart{

    public PieChart(){
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("饼状图");
    }
}
