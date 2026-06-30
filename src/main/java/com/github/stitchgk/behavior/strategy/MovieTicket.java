package com.github.stitchgk.behavior.strategy;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class MovieTicket {

    private double price;
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        if (this.discount == null) {
            return this.price;
        }
        return this.discount.calculate(this.price);
    }
}
