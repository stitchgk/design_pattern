package com.github.stitchgk.behavior.commandundo;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public class AddCommand extends AbstractCommand{
    private Adder adder = new Adder();
    private int value;
    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
