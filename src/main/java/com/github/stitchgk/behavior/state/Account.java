package com.github.stitchgk.behavior.state;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class Account {

    private AccountState state;
    private String owner;
    private double balance = 0;

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = init;
        this.state = new NormalState(this);
        this.state.stateCheck();
        System.out.println(this.owner + "开户，初始金额为" + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    AccountState getState() {
        return this.state;
    }

    public void deposit(double amount) {
        this.state.deposit(amount);
    }

    public void withdraw(double amount) {
        this.state.withdraw(amount);
    }

    public void computeInterest() {
        this.state.computeInterest();
    }

    public String getOwner() {
        return owner;
    }
}
