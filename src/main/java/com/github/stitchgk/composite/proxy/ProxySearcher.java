package com.github.stitchgk.composite.proxy;

/**
 * @author: jiaofanghao
 * @time: 2026/6/8
 **/
public class ProxySearcher implements Searcher{

    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        if (validate(userId)) {
            String result = realSearcher.doSearch(userId, keyword);
            this.log(userId);
            return result;
        }
        return null;
    }

    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String logMsg) {
        logger = new Logger();
        logger.log(logMsg);
    }
}
