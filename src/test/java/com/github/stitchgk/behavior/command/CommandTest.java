package com.github.stitchgk.behavior.command;

import com.github.stitchgk.behavior.command.*;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/17
 **/
public class CommandTest {

    @Test
    public void test() {
        FBSettingWindow fbSettingWindow = new FBSettingWindow("窗体");
        FunctionButton fb = new FunctionButton("功能键");
        FunctionButton fb2 = new FunctionButton("功能键2");
        Command command = (Command) XMLUtil.getBean(0);
        Command command2 = (Command) XMLUtil.getBean(1);
        fb.setCommand(command);
        fb2.setCommand(command2);

        fbSettingWindow.addFunctionButton(fb);
        fbSettingWindow.addFunctionButton(fb2);
        fbSettingWindow.display();

        fb.click();
        fb2.click();
    }
}
