package com.github.stitchgk.creative.prototype.weeklylog;

import java.io.Serializable;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class DeepAttachment implements Serializable {
    private static final long serialVersionUID = 1L;
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
