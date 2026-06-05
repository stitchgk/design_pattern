package com.github.stitchgk.composite.adapter;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class AdapterUtil {

    public static Object getBean() {
        try {
            DocumentBuilderFactory dcFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dcFactory.newDocumentBuilder();
            Document doc = builder.parse(AdapterUtil.class.getClassLoader().getResourceAsStream("config_adapter.xml"));
            String adapterType = doc.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
            return Class.forName(adapterType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
