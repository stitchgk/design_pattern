package com.github.stitchgk.creative.prototype.weeklylog;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class ShallowWeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;

    private ShallowAttachment attachment;

    public ShallowAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(ShallowAttachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ShallowWeeklyLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public ShallowWeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (ShallowWeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
