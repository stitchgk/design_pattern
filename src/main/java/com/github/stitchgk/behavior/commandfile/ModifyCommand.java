package com.github.stitchgk.behavior.commandfile;

import java.io.Serializable;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class ModifyCommand extends Command implements Serializable {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }
}
