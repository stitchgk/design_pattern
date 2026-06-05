package com.github.stitchgk.createive.singleton;

import com.github.stitchgk.creative.singleton.HolderSingleton;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class HolderSingletonTest {

    @Test
    public void testIoDHSingleton() {
        HolderSingleton instance1 = HolderSingleton.getInstance();
        HolderSingleton instance2 = HolderSingleton.getInstance();

        assert(instance1 == instance2);
    }

}
