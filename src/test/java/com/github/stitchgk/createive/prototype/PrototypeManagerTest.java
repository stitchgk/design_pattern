package com.github.stitchgk.createive.prototype;

import com.github.stitchgk.creative.prototype.manager.OfficialDocument;
import com.github.stitchgk.creative.prototype.manager.PrototypeManager;
import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class PrototypeManagerTest {

    @Test
    public void test() {
        PrototypeManager prototypeManager = PrototypeManager.getInstance();

        OfficialDocument doc1, doc2, doc3, doc4;

        doc1 = prototypeManager.getOfficialDocument("far");
        doc1.display();
        doc2 = prototypeManager.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);
        doc3 = prototypeManager.getOfficialDocument("srs");
        doc3.display();
        doc4 = prototypeManager.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc1 == doc3);
        /**
         * Output:
         * 可行性分析报告
         * 可行性分析报告
         * false
         * 软件需求规格说明书
         * 软件需求规格说明书
         * false
         */
    }

}
