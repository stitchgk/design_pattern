package com.github.stitchgk.behavior.templatemethod;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class SavingAccount extends Account {

    @Override
    public void calculateInterest() {
        System.out.println("Saving account interest calculation.");
    }
}
