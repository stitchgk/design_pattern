package com.github.stitchgk.createive.singleton;

import com.github.stitchgk.creative.singleton.EnumSingleton;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class EnumSingletonTest {

    @Test
    public void test(){
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        assert(instance1 == instance2);
    }
}
