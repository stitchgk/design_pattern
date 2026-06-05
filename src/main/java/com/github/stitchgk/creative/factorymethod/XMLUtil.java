package com.github.stitchgk.creative.factorymethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author: jiaofanghao
 * @time: 2026/6/3
 **/
public class XMLUtil {

    public static Object getBean() {
        try {
            DocumentBuilderFactory dcFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dcFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(XMLUtil.class.getClassLoader().getResourceAsStream("config.xml"));

            // 获取根节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            // 通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(cName);
            return c.newInstance();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
