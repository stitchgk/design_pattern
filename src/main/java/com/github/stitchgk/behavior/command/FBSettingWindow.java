package com.github.stitchgk.behavior.command;

import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtonList = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        this.functionButtonList.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        this.functionButtonList.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口：" + this.title);
        for (FunctionButton fb : this.functionButtonList) {
            System.out.println(fb.getName());
        }
    }
}
