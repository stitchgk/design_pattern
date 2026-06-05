package com.github.stitchgk.creative.singleton;

/**
 * 静态内部类单例
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class HolderSingleton {
    private HolderSingleton(){}

    private static class SingletonHolder{
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }
    public static final HolderSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
