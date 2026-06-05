package com.github.stitchgk.creative.factorymethod;

/**
 * @author: jiaofanghao
 * @time: 2026/6/3
 **/
public class ConcreteFactoryB implements  Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
