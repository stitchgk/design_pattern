package com.github.stitchgk.composite.flyweight;

import java.util.Hashtable;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;

    private IgoChessmanFactory() {
        ht = new Hashtable(100);
        IgoChessman blackIgoChessman = new BlackIgoChessman();
        ht.put("b", blackIgoChessman);
        IgoChessman whiteIgoChessman = new WhiteIgoChessman();
        ht.put("w", whiteIgoChessman);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
