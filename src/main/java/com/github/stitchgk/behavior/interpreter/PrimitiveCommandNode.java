package com.github.stitchgk.behavior.interpreter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class PrimitiveCommandNode extends Node {

    private String name;
    private String text;

    @Override
    public void interpret(Context context) {
        name = context.currentToken();
        context.skipToken(name);

        if ("PRINT".equals(name)) {
            text = context.currentToken();
            context.nextToken();
        } else if (!"SPACE".equals(name) && !"BREAK".equals(name)) {
            throw new IllegalArgumentException("非法命令: " + name);
        }
    }

    @Override
    public void execute() {
        if ("PRINT".equals(name)) {
            System.out.print(text);
        } else if ("SPACE".equals(name)) {
            System.out.print(" ");
        } else if ("BREAK".equals(name)) {
            System.out.println();
        }
    }
}
