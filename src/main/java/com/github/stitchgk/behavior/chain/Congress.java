package com.github.stitchgk.behavior.chain;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request);
    }
}
