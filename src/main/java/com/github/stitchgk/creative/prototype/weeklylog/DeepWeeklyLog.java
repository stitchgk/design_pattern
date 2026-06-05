package com.github.stitchgk.creative.prototype.weeklylog;

import java.io.*;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class DeepWeeklyLog implements Serializable {
    private String name;
    private String date;
    private String content;
    private DeepAttachment attachment;

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

    public DeepAttachment getAttachment() {
        return attachment;
    }

    public void setAttachment(DeepAttachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "DeepWeeklyLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", attachment=" + attachment +
                '}';
    }

    public DeepWeeklyLog deepClone() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
            return (DeepWeeklyLog) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
