package com.github.stitchgk.creative.builder;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String hairStyle;
    private String costume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", face='" + face + '\'' +
                ", hairStyle='" + hairStyle + '\'' +
                ", costume='" + costume + '\'' +
                '}';
    }
}
