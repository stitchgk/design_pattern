package com.github.stitchgk.creative.abstractfactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public interface SkinFactory {

    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();

}
