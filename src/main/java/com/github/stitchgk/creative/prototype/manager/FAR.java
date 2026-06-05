package com.github.stitchgk.creative.prototype.manager;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class FAR implements OfficialDocument{
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("可行性分析报告");
    }
}
