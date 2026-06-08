package com.github.stitchgk.composite.composite;

/**
 * @author: jiaofanghao
 * @time: 2026/6/5
 **/
abstract class AbstractFile {

    abstract void add(AbstractFile file);
    abstract void remove(AbstractFile file);
    abstract AbstractFile getChild(int i);
    abstract void killVirus();

}
