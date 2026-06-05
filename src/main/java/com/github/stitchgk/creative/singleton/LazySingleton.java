package com.github.stitchgk.creative.singleton;

/**
 * 懒汉式单例
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class LazySingleton {
    private volatile static LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class) {
                // 双重检查锁定 (Double Check Locking)
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
