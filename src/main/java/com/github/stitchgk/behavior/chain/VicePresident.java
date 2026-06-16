package com.github.stitchgk.behavior.chain;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "处理了采购单：" + request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
