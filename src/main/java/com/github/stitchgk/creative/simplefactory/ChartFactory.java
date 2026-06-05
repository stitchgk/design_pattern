package com.github.stitchgk.creative.simplefactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class ChartFactory {
    public static Chart getChart(String type){
        if("pie".equalsIgnoreCase(type)){
            return new PieChart();
        }else if("line".equalsIgnoreCase(type)){
            return new LineChart();
        }else if("histogram".equalsIgnoreCase(type)){
            return new HistogramChart();
        }else{
            return null;
        }
    }
}
