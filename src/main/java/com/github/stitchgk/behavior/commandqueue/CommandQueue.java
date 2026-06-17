package com.github.stitchgk.behavior.commandqueue;

import com.github.stitchgk.behavior.command.Command;

import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public class CommandQueue {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }

    public void removeCommand(Command cmd) {
        commands.remove(cmd);
    }

    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }
}
