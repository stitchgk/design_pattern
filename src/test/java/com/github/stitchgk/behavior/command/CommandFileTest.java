package com.github.stitchgk.behavior.command;

import com.github.stitchgk.behavior.commandfile.Command;
import com.github.stitchgk.behavior.commandfile.ConfigOperator;
import com.github.stitchgk.behavior.commandfile.ConfigSettingWindow;
import com.github.stitchgk.behavior.commandfile.InsertCommand;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class CommandFileTest {

    @Test
    public void test() {
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();
        Command command;
        ConfigOperator configOperator = new ConfigOperator();

        command = new InsertCommand("增加");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        configSettingWindow.save();

        configSettingWindow.recover();
        System.out.println(configSettingWindow);
    }

}
