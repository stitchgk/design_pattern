package com.github.stitchgk.behavior.command;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class MinimizeCommand extends Command {
    private WindowHandler whObj;

    public MinimizeCommand() {
        this.whObj = new WindowHandler();
    }

    @Override
    public void execute() {
        whObj.minimize();
    }
}
