package com.coldfire.spring.factory;

import com.coldfire.spring.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-10-08&nbsp;17:23<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;bean工厂类接口<br/><br/>
 */
public interface BeanFactory {

    public Object getBean(String name);

    /**
     * 注册bean
     * @param name 自定义bean名称
     * @param beanDefinition bean定义
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) ;

}
