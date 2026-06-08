package com.github.stitchgk.composite.facade;

import org.junit.Test;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class FacadeTest {

    @Test
    public void test() {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("/Users/jiaofanghao/workspace/person/java/design-pattern/src/test/resources/facade_source.txt", "/Users/jiaofanghao/workspace/person/java/design-pattern/src/test/resources/facade_encrypt.txt");
    }

}
