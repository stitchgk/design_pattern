package com.github.stitchgk.behavior.strategy;

import com.github.stitchgk.behavior.strategy.ChildrenDiscount;
import com.github.stitchgk.behavior.strategy.MovieTicket;
import com.github.stitchgk.behavior.strategy.StudentDiscount;
import com.github.stitchgk.behavior.strategy.VIPDiscount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class MovieTicketTest {

    @Test
    public void testNoDiscount() {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(60);

        assertEquals(60, ticket.getPrice(), 0.001);
    }

    @Test
    public void testStudentDiscount() {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(60);
        ticket.setDiscount(new StudentDiscount());

        assertEquals(48, ticket.getPrice(), 0.001);
    }

    @Test
    public void testVIPDiscount() {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(60);
        ticket.setDiscount(new VIPDiscount());

        assertEquals(30, ticket.getPrice(), 0.001);
    }

    @Test
    public void testChildrenDiscount() {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(60);
        ticket.setDiscount(new ChildrenDiscount());

        assertEquals(50, ticket.getPrice(), 0.001);
    }

    @Test
    public void testChangeDiscountAtRuntime() {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(60);

        ticket.setDiscount(new StudentDiscount());
        assertEquals(48, ticket.getPrice(), 0.001);

        ticket.setDiscount(new VIPDiscount());
        assertEquals(30, ticket.getPrice(), 0.001);
    }
}
