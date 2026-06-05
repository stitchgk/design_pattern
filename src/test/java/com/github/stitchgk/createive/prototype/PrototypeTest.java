package com.github.stitchgk.createive.prototype;

import com.github.stitchgk.creative.prototype.weeklylog.*;
import org.junit.Test;

/**
 * @author: zhangsan
 * @time: 2026/6/4
 **/
public class PrototypeTest {
    
    @Test
    public void testPrototype() {
        WeeklyLog log = new WeeklyLog();
        log.setName("zhangsan");
        log.setContent("zhangsan is a good boy");
        log.setDate("2026/6/4");
        System.out.println("------------周报------------");
        System.out.println(log);


        WeeklyLog log1 = log.clone();
        log1.setName("zhangsan1");
        log1.setContent("zhangsan1 is a good boy");
        log1.setDate("2026/6/5");
        System.out.println("------------周报------------");
        System.out.println(log1);

    }

    @Test
    public void testShallowClone() {
        ShallowWeeklyLog log = new ShallowWeeklyLog();
        ShallowAttachment attachment = new ShallowAttachment();
        log.setAttachment(attachment);
        ShallowWeeklyLog log1 = log.clone();
        System.out.println("周报是否相同" + (log == log1));
        System.out.println("附件是否相同" + (log.getAttachment() == log1.getAttachment()));
        /**
         * Output:
         * 周报是否相同false
         * 附件是否相同true
         */
    }

    @Test
    public void testDeepClone() {
        DeepWeeklyLog log, log1;
        log = new DeepWeeklyLog();
        DeepAttachment deepAttachment = new DeepAttachment();
        log.setAttachment(deepAttachment);
        log1 = log.deepClone();
        System.out.println("周报是否相同" + (log == log1));
        System.out.println("附件是否相同" + (log.getAttachment() == log1.getAttachment()));
        /**
         * Output:
         * 周报是否相同false
         * 附件是否相同false
         */
    }
    
}
