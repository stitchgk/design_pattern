package com.github.stitchgk.behavior.command;

import com.github.stitchgk.behavior.commandundo.AddCommand;
import com.github.stitchgk.behavior.commandundo.CalculatorForm;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public class CommandUndoTest {

    @Test
    public void test() {
        CalculatorForm calculatorForm = new CalculatorForm();
        calculatorForm.setCommand(new AddCommand());
        calculatorForm.compute(10);
        calculatorForm.compute(30);
        calculatorForm.undo();
    }

}
