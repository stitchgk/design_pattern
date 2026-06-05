package com.github.stitchgk.creative.builder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class BuilderUtil {

    public static Object getBean() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;
            Document parse = builder.parse(BuilderUtil.class.getClassLoader().getResourceAsStream("config_builder.xml"));
            NodeList nodeList = parse.getElementsByTagName("className");
            String builderClassName = nodeList.item(0).getFirstChild().getNodeValue();
            Class builderClass = Class.forName(builderClassName);
            return builderClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
