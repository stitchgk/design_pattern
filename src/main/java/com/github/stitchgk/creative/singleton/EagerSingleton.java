package com.github.stitchgk.creative.singleton;

/**
 * 饿汉模式
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
