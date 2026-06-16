package com.github.stitchgk.behavior.chain;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "处理了采购单：" + request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
