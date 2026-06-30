package com.github.stitchgk.behavior.observer;

import java.util.ArrayList;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public abstract class AllyControlCenter {

    protected String allyName;
    protected ArrayList<Observer> players = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer obs) {
        System.out.println(obs.getName() + " 加入 " + this.allyName + " 成功！");
        players.add(obs);
    }

    public abstract void notifyObserver(String name);
}
