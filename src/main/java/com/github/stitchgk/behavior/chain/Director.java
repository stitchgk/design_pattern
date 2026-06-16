package com.github.stitchgk.behavior.chain;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "处理了采购单：" + request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
