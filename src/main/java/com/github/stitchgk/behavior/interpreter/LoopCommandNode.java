package com.github.stitchgk.behavior.interpreter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class LoopCommandNode extends Node {

    private int number;
    private Node commandNode;

    @Override
    public void interpret(Context context) {
        context.skipToken("LOOP");
        number = context.currentNumber();
        context.nextToken();
        commandNode = new ExpressionNode();
        commandNode.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++) {
            commandNode.execute();
        }
    }
}
