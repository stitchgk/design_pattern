package com.github.stitchgk.behavior.interpreter;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class InterpreterTest {

    @Test
    public void test() {
        String text = "LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";

        Context context = new Context(text);
        Node node = new ExpressionNode();
        node.interpret(context);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = System.out;
        try {
            System.setOut(new PrintStream(output));
            node.execute();
        } finally {
            System.setOut(out);
        }

        Assert.assertEquals("杨过  小龙女\n杨过  小龙女\n郭靖  黄蓉", output.toString());
    }
}
