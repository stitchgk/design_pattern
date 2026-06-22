package com.github.stitchgk.behavior.commandfile;

import java.sql.Array;
import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class ConfigSettingWindow {

    private ArrayList<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        FileUtil.writeCommands(commands);
    }

    public void recover() {
        ArrayList<Command> list = FileUtil.readCommands();
        for (Command cmd : list) {
            cmd.execute();
        }
    }

}
