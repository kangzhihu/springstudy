package com.coldfire.spring.reader;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;17:14<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;bean解析器<br/><br/>
 */
public interface BeanDefinetionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
