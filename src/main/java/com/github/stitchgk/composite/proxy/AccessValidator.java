package com.github.stitchgk.composite.proxy;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class AccessValidator {
    public boolean validate(String userId) {
        System.out.println("在数据库中验证用户" + userId + "是不是合法用户？");
        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println(userId + "登录成功！");
            return true;
        } else {
            System.out.println("登录失败！");
        }
        return false;
    }
}
