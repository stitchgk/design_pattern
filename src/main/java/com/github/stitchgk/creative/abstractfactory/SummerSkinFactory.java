package com.github.stitchgk.creative.abstractfactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class SummerSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
