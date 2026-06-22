package com.github.stitchgk.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class ExpressionNode extends Node {

    private final List<Node> list = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (context.currentToken() != null) {
            if ("END".equals(context.currentToken())) {
                context.skipToken("END");
                break;
            }

            Node commandNode = new CommandNode();
            commandNode.interpret(context);
            list.add(commandNode);
        }
    }

    @Override
    public void execute() {
        for (Node node : list) {
            node.execute();
        }
    }
}
