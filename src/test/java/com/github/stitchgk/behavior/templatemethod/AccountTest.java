package com.github.stitchgk.behavior.templatemethod;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class AccountTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream output;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCurrentAccountHandle() {
        Account account = new CurrentAccount();

        account.handle("account", "password");

        String text = output.toString();
        assertTrue(text.contains("Account validation succeeded."));
        assertTrue(text.contains("Current account interest calculation."));
        assertTrue(text.contains("Account information displayed."));
    }

    @Test
    public void testSavingAccountHandle() {
        Account account = new SavingAccount();

        account.handle("account", "password");

        String text = output.toString();
        assertTrue(text.contains("Account validation succeeded."));
        assertTrue(text.contains("Saving account interest calculation."));
        assertTrue(text.contains("Account information displayed."));
    }

    @Test
    public void testHandleStopsWhenValidateFailed() {
        Account account = new SavingAccount();

        account.handle("account", "bad-password");

        String text = output.toString();
        assertTrue(text.contains("Invalid account or password."));
        assertFalse(text.contains("Saving account interest calculation."));
        assertFalse(text.contains("Account information displayed."));
    }
}
