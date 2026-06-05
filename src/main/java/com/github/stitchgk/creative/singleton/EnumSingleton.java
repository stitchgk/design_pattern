package com.github.stitchgk.creative.singleton;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public enum EnumSingleton {
    INSTANCE;
    public void doSomething(){
        System.out.println("Singleton supply functions");
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
