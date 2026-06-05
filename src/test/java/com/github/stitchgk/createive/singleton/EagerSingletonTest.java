package com.github.stitchgk.createive.singleton;

import com.github.stitchgk.creative.singleton.EagerSingleton;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class EagerSingletonTest {

    @Test
    public void testEagerSingleton() {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        boolean isSame = instance1 == instance2;
        assert(isSame);
    }

}
