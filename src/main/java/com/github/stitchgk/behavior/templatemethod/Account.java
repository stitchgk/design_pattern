package com.github.stitchgk.behavior.templatemethod;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public abstract class Account {

    private static final String VALID_ACCOUNT = "account";
    private static final String VALID_PASSWORD = "password";

    public boolean validate(String account, String password) {
        boolean valid = VALID_ACCOUNT.equals(account) && VALID_PASSWORD.equals(password);
        if (valid) {
            System.out.println("Account validation succeeded.");
        } else {
            System.out.println("Invalid account or password.");
        }
        return valid;
    }

    public abstract void calculateInterest();

    public void display() {
        System.out.println("Account information displayed.");
    }

    public final void handle(String account, String password) {
        if (!validate(account, password)) {
            return;
        }
        calculateInterest();
        display();
    }
}
