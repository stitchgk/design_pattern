package com.github.stitchgk.composite.decorator;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class DecoratorTest {

    @Test
    public void test() {
        Component component,componentSB,componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
        /**
         * Output:
         * 为构件增加黑色边框！
         * 为构件增加滚动条！
         * 显示窗体！
         */
    }

}
