package com.github.stitchgk.createive.singleton;

import com.github.stitchgk.creative.singleton.EagerSingleton;
import com.github.stitchgk.creative.singleton.EnumSingleton;
import com.github.stitchgk.creative.singleton.HolderSingleton;
import com.github.stitchgk.creative.singleton.SingletonManager;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class SingletonManagerTest {

    @Test
    public void testSingletonManager() {
        EagerSingleton instance = EagerSingleton.getInstance();
        EnumSingleton instance1 = EnumSingleton.getInstance();
        HolderSingleton instance2 = HolderSingleton.getInstance();
        SingletonManager.register("EagerSingleton", instance);
        SingletonManager.register("EnumSingleton", instance1);
        SingletonManager.register("HolderSingleton", instance2);
        EagerSingleton instance3 = (EagerSingleton) SingletonManager.getInstance("EagerSingleton", EagerSingleton.class);
        EnumSingleton instance4 = (EnumSingleton) SingletonManager.getInstance("EnumSingleton", EnumSingleton.class);
        HolderSingleton instance5 = (HolderSingleton) SingletonManager.getInstance("HolderSingleton", HolderSingleton.class);
        assert instance == instance3;
        assert instance1 == instance4;
        assert instance2 == instance5;
    }
}
