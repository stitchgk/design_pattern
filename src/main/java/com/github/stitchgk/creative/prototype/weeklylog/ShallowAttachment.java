package com.github.stitchgk.creative.prototype.weeklylog;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class ShallowAttachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件：" + name);
    }
}
