package com.github.stitchgk.createive.simplefactory;

import com.github.stitchgk.creative.simplefactory.Chart;
import com.github.stitchgk.creative.simplefactory.ChartFactory;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class ChartFactorTest {

    @Test
    public void testChartFactory() {
        Chart chart = ChartFactory.getChart("pie");
        assert chart != null;
        chart.display();
    }

}
