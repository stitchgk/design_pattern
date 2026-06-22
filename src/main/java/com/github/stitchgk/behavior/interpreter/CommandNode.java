package com.github.stitchgk.behavior.interpreter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class CommandNode extends Node {

    private Node node;

    @Override
    public void interpret(Context context) {
        if ("LOOP".equals(context.currentToken())) {
            node = new LoopCommandNode();
        } else {
            node = new PrimitiveCommandNode();
        }
        node.interpret(context);
    }

    @Override
    public void execute() {
        node.execute();
    }
}
