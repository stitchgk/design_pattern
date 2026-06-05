package com.github.stitchgk.creative.prototype.manager;

import java.util.Hashtable;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class PrototypeManager {

    private Hashtable ht = new Hashtable();
    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String name, OfficialDocument od) {
        ht.put(name, od);
    }

    public OfficialDocument getOfficialDocument(String name) {
        OfficialDocument od = (OfficialDocument) ht.get(name);
        return od.clone();
    }

    public static PrototypeManager getInstance() {
        return pm;
    }

}
