package com.github.stitchgk.behavior.observer;

/**
 * @author: jiaofanghao
 * @time: 2026/6/30
 **/
public class ConcreteAllyControlCenter extends AllyControlCenter{

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println("向" + this.allyName + "战队的成员发送通知：" + name + "遭受攻击！");
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
