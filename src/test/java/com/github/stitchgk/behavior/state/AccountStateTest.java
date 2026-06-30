package com.github.stitchgk.behavior.state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class AccountStateTest {

    @Test
    public void testStateTransfer() {
        Account account = new Account("段誉", 0);
        assertTrue(account.getState() instanceof NormalState);

        account.deposit(1000);
        assertEquals(1000, account.getBalance(), 0.001);
        assertTrue(account.getState() instanceof NormalState);

        account.withdraw(1500);
        assertEquals(-500, account.getBalance(), 0.001);
        assertTrue(account.getState() instanceof OverdraftState);

        account.withdraw(2000);
        assertEquals(-2500, account.getBalance(), 0.001);
        assertTrue(account.getState() instanceof RestrictedState);

        account.withdraw(100);
        assertEquals(-2500, account.getBalance(), 0.001);
        assertTrue(account.getState() instanceof RestrictedState);

        account.deposit(1000);
        assertEquals(-1500, account.getBalance(), 0.001);
        assertTrue(account.getState() instanceof OverdraftState);

        account.deposit(1500);
        assertEquals(0, account.getBalance(), 0.001);
        assertTrue(account.getState() instanceof NormalState);
    }

    @Test
    public void testComputeInterest() {
        Account account = new Account("虚竹", 0);
        account.computeInterest();

        account.withdraw(100);
        account.computeInterest();

        account.withdraw(2000);
        account.computeInterest();
    }
}
