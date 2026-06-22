package com.github.stitchgk.behavior.interpreter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public abstract class Node {

    public abstract void interpret(Context context);

    public abstract void execute();
}
