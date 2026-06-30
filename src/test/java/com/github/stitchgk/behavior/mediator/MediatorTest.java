package com.github.stitchgk.behavior.mediator;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * 中介者模式:
 *   对于某些对象之间的通信，需要一个第三方对象来处理。
 *
 * 测试流程:
 *   1.创建中介者
 *   2.创建组件对象
 *   3.每个组件都设置中介者
 *   4.组件更新 / 被点击时,中介者会更新其他的组件
 * @author: jiaofanghao
 * @time: 2026/6/23
 **/
public class MediatorTest {

    @Test
    public void test() {
        ConcreteMediator mediator = new ConcreteMediator();

        Button addButton = new Button();
        List list = new List();
        TextBox userNameTextBox = new TextBox();
        ComboBox cb = new ComboBox();

        addButton.setMediator(mediator);
        list.setMediator(mediator);
        userNameTextBox.setMediator(mediator);
        cb.setMediator(mediator);

        mediator.addButton = addButton;
        mediator.list = list;
        mediator.userNameTextBox = userNameTextBox;
        mediator.cb = cb;

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = System.out;
        try {
            System.setOut(new PrintStream(output));

            addButton.changed();
            list.changed();
            cb.changed();
        } finally {
            System.setOut(out);
        }

        Assert.assertEquals("--单击增加按钮--\n"
                + "列表框增加一项：张无忌。\n"
                + "组合框增加一项：张无忌。\n"
                + "客户信息增加成功后文本框清空。\n"
                + "--从列表框选择客户--\n"
                + "组合框选中项：小龙女。\n"
                + "文本框显示：小龙女。\n"
                + "--从组合框选择客户--\n"
                + "列表框选中项：小龙女。\n"
                + "文本框显示：小龙女。\n", output.toString());
    }

}
