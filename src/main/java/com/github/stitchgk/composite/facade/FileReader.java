package com.github.stitchgk.composite.facade;

import java.io.FileInputStream;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("读取文件，获取明文");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while((data = inFS.read()) != -1) {
                sb = sb.append((char)data);
            }
            inFS.close();
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
