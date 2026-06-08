package com.github.stitchgk.composite.composite;

/**
 * @author: jiaofanghao
 * @time: 2026/6/5
 **/
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }
    @Override
    void add(AbstractFile file) {
        System.out.println("不支持该操作!");
    }

    @Override
    void remove(AbstractFile file) {
        System.out.println("不支持该操作!");
    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("不支持该操作!");
        return null;
    }

    @Override
    void killVirus() {
        // 模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
