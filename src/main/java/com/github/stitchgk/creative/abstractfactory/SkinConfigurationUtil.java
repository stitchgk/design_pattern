package com.github.stitchgk.creative.abstractfactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class SkinConfigurationUtil {

    public static Object getBean() {
        try {
            DocumentBuilderFactory dcFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dcFactory.newDocumentBuilder();
            Document document = builder.parse(SkinConfigurationUtil.class.getClassLoader().getResourceAsStream("config_abstractfactory.xml"));
            NodeList className = document.getElementsByTagName("className");
            String skinType = className.item(0).getFirstChild().getNodeValue();
            return Class.forName(skinType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
