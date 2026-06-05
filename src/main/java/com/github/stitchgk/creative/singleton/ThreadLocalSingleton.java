package com.github.stitchgk.creative.singleton;

/**
 * 线程安全单例
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL.get();
    }
}
