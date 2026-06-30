package com.github.stitchgk.behavior.state;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class OverdraftState extends AccountState {

    public OverdraftState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
        System.out.println("存款" + amount + "，当前余额为" + acc.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
        System.out.println("取款" + amount + "，当前余额为" + acc.getBalance());
    }

    @Override
    public void computeInterest() {
        System.out.println("透支状态，计算利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() >= 0) {
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() < -2000) {
            acc.setState(new RestrictedState(this));
        }
    }
}
