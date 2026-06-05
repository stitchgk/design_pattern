package com.github.stitchgk.creative.simplefactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class HistogramChart implements  Chart{
    public HistogramChart(){
        System.out.println("创建柱状图");
    }
    @Override
    public void display() {
        System.out.println("柱状图 展示");
    }
}
