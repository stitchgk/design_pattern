package com.github.stitchgk.composite.decorator;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
