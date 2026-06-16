package com.github.stitchgk.behavior.chain;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
    public abstract void processRequest(PurchaseRequest request);
}
