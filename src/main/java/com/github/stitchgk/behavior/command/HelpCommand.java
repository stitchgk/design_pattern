package com.github.stitchgk.behavior.command;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class HelpCommand extends Command{
    private HelpHandler hhObj;

    public HelpCommand() {
        this.hhObj = new HelpHandler();
    }

    @Override
    public void execute() {
        hhObj.display();
    }
}
