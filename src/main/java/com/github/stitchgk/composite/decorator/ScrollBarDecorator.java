package com.github.stitchgk.composite.decorator;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Component component)
    {
        super(component);
    }

    void display() {
        this.setScrollBar();
        super.display();
    }

    void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
