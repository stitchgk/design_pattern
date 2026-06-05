package com.github.stitchgk.createive.abstractfactory;

import com.github.stitchgk.creative.abstractfactory.SkinConfigurationUtil;
import com.github.stitchgk.creative.abstractfactory.SkinFactory;
import com.github.stitchgk.creative.abstractfactory.SpringSkinFactory;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
        SkinFactory skinFactory = (SkinFactory) SkinConfigurationUtil.getBean();
        skinFactory.createButton();
        skinFactory.createTextField();
        skinFactory.createComboBox();
    }

}
