package com.github.stitchgk.composite.facade;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;
    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainText = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainText);
        writer.write(encryptStr, fileNameDes);
    }
}
