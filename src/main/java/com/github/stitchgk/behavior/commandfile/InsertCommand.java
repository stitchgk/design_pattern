package com.github.stitchgk.behavior.commandfile;

import java.io.Serializable;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class InsertCommand extends Command implements Serializable {
    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.insert(this.args);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }
}
