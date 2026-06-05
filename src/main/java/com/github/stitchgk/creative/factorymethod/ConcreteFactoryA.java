package com.github.stitchgk.creative.factorymethod;

/**
 * @author: jiaofanghao
 * @time: 2026/6/3
 **/
public class ConcreteFactoryA implements  Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
