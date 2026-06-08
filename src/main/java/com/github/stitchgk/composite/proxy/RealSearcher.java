package com.github.stitchgk.composite.proxy;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class RealSearcher implements Searcher{
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户" + userId + "执行了搜索" + keyword);
        return "返回具体内容";
    }
}
