package com.github.stitchgk.createive.factorymethod;

import com.github.stitchgk.creative.factorymethod.ConcreteFactoryA;
import com.github.stitchgk.creative.factorymethod.Factory;
import com.github.stitchgk.creative.factorymethod.Product;
import com.github.stitchgk.creative.factorymethod.XMLUtil;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/3
 **/
public class FactoryMethodTest {

    /**
     * 工厂方法直接使用
     */
    @Test
    public void testFactoryMethod() {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.show();
    }

    /**
     * 通过配置文件 + 反射的方式 使用工厂方法
     */
    @Test
    public void testFactoryMethodUseConfigFile() {
        Factory factory = (Factory) XMLUtil.getBean();
        Product product = factory.createProduct();
        product.show();
    }

}
