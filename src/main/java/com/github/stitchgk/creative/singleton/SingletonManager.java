package com.github.stitchgk.creative.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 单例管理器
 * @author: jiaofanghao
 * @time: 2026/6/2
 **/
public class SingletonManager {
    private static final Map<String, Object> INSTANCE_MAP = new ConcurrentHashMap<>();

    private SingletonManager() {
    }

    public static void register(String key, Object instance) {
        if (!INSTANCE_MAP.containsKey(key)) {
            INSTANCE_MAP.put(key, instance);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getInstance(String key, Class<T> clazz) {
        return (T) INSTANCE_MAP.get(key);
    }
}
