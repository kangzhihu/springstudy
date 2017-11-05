package com.coldfire.spring.factory;

import com.coldfire.spring.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-10-08&nbsp;18:07<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;所有bean工厂父类，有内存缓存<br/><br/>
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }

    /**
     * 各子类实现不同的创建bean方式
     * @param beanDefinition
     * @return bean
     */
    protected  abstract Object doCreateBean(BeanDefinition beanDefinition);
}
