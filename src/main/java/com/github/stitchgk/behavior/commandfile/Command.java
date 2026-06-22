package com.github.stitchgk.behavior.commandfile;

import java.io.Serializable;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public abstract class Command implements Serializable {

    /**
     * 命令名称
     */
    protected String name;
    /**
     * 命令执行参数
     */
    protected String args;
    /**
     * 配置具体执行的操作类
     */
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    /**
     * recover 之后, args 自带，不需要再额外增加参数了
     */
    public abstract void execute();
    public abstract void execute(String args);
}
