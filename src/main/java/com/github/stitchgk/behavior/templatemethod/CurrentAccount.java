package com.github.stitchgk.behavior.templatemethod;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class CurrentAccount extends Account {

    @Override
    public void calculateInterest() {
        System.out.println("Current account interest calculation.");
    }
}
