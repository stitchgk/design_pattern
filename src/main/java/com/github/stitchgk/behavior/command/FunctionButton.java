package com.github.stitchgk.behavior.command;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        System.out.println(name + ":");
        command.execute();
    }

}
