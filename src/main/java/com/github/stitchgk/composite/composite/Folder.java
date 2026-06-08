package com.github.stitchgk.composite.composite;

import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/5
 **/
public class Folder extends AbstractFile{
    private ArrayList<AbstractFile> files = new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    void killVirus() {
        System.out.println("对文件夹：" + name + "进行杀毒。");
        for(AbstractFile file : files) {
            file.killVirus();
        }
    }
}
