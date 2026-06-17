package com.github.stitchgk.behavior.commandundo;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public abstract class AbstractCommand {
    public abstract int execute(int value);

    public abstract int undo();
}
