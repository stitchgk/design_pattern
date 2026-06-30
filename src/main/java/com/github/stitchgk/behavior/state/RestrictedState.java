package com.github.stitchgk.behavior.state;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class RestrictedState extends AccountState {

    public RestrictedState(AccountState state) {
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
        System.out.println("账号受限，取款失败！");
    }

    @Override
    public void computeInterest() {
        System.out.println("受限状态，计算利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() >= 0) {
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() >= -2000) {
            acc.setState(new OverdraftState(this));
        }
    }
}
