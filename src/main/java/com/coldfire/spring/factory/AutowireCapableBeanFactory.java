package com.coldfire.spring.factory;

import com.coldfire.spring.BeanDefinition;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;15:31<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;工厂子类<br/><br/>
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try{
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
