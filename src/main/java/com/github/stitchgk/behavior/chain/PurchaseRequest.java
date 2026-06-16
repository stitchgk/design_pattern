package com.github.stitchgk.behavior.chain;

import java.util.Objects;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class PurchaseRequest {
    private Double amount;
    private Integer number;
    private String purpose;

    public PurchaseRequest(Double amount, Integer number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof PurchaseRequest)) return false;

        PurchaseRequest that = (PurchaseRequest) o;
        return Objects.equals(getAmount(), that.getAmount()) && Objects.equals(getNumber(), that.getNumber()) && Objects.equals(getPurpose(), that.getPurpose());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getAmount());
        result = 31 * result + Objects.hashCode(getNumber());
        result = 31 * result + Objects.hashCode(getPurpose());
        return result;
    }

    @Override
    public String toString() {
        return "PurchaseRequest{" +
                "amount=" + amount +
                ", number=" + number +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
