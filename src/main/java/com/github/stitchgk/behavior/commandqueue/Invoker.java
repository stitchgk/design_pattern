package com.github.stitchgk.behavior.commandqueue;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public class Invoker {
    private CommandQueue commandQueue;
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call() {
        this.commandQueue.execute();
    }
}
