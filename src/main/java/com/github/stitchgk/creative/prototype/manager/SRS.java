package com.github.stitchgk.creative.prototype.manager;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class SRS implements OfficialDocument{
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("软件需求规格说明书");
    }
}
