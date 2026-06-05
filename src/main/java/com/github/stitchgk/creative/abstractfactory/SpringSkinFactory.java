package com.github.stitchgk.creative.abstractfactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
