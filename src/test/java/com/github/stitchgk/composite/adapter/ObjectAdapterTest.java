package com.github.stitchgk.composite.adapter;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class ObjectAdapterTest {

    @Test
    public void test() {
        ScoreOperation operation = (ScoreOperation) AdapterUtil.getBean();
        int[] score = {10, 20, 30, 40, 50};
        int[] result = operation.sort(score);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println(operation.search(score, 30));
        System.out.println(operation.search(score, 60));
    }
}
