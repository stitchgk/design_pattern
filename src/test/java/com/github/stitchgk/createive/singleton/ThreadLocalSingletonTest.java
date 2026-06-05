package com.github.stitchgk.createive.singleton;

import com.github.stitchgk.creative.singleton.ThreadLocalSingleton;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class ThreadLocalSingletonTest {

    @Test
    public void testThreadLocalSingleton() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(ThreadLocalSingleton.getInstance());
            }).start();
        }
    }

}
