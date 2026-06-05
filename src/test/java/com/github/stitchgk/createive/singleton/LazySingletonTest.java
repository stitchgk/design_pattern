package com.github.stitchgk.createive.singleton;

import com.github.stitchgk.creative.singleton.LazySingleton;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class LazySingletonTest {

    @Test
    public void test() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        assert(instance1 == instance2);
    }
}
