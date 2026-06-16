package com.github.stitchgk.behavior;

import com.github.stitchgk.behavior.chain.*;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/15
 **/
public class ChainTest {

    @Test
    public void test() {
        Approver wjzhang,gyang,jguo,meeting;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        PurchaseRequest request = new PurchaseRequest(45000.0, 1, "购买倚天剑");
        wjzhang.processRequest(request);
        PurchaseRequest request2 = new PurchaseRequest(60000.0, 2, "购买倚天屠龙刀");
        wjzhang.processRequest(request2);
        PurchaseRequest request3 = new PurchaseRequest(160000.0, 3, "购买《九阳真经》");
        wjzhang.processRequest(request3);
        PurchaseRequest request4 = new PurchaseRequest(800000.0, 4, "购买桃花岛");
        wjzhang.processRequest(request4);
    }

}
