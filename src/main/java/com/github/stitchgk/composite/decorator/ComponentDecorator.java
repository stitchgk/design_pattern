package com.github.stitchgk.composite.decorator;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
    @Override
    void display() {
        component.display();
    }
}
