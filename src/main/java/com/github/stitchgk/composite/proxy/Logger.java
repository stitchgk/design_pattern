package com.github.stitchgk.composite.proxy;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class Logger {
    public void log(String msg) {
        System.out.println("更新数据库，用户:" + msg + "查询次数加1！");
    }
}
