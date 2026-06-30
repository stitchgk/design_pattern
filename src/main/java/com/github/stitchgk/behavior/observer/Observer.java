package com.github.stitchgk.behavior.observer;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public interface Observer {

    public String getName();
    public void setName(String name);
    public void help();
    public void beAttacked(AllyControlCenter acc);

}
