package com.github.stitchgk.composite.facade;

import java.io.FileOutputStream;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件。");
        try {
            FileOutputStream outFS = new FileOutputStream(fileNameDes);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
