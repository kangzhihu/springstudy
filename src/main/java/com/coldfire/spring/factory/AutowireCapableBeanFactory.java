package com.coldfire.spring.factory;

import com.coldfire.spring.BeanDefinition;
import com.coldfire.spring.model.PropertyValue;

import java.lang.reflect.Field;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;15:31<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;工厂子类<br/><br/>
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    //根据配置，设置当前bean的属性
    protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
        for(PropertyValue propertyValue:mbd.getPropertyValues().getPropertyValues()){
            Field field = mbd.getBeanClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            field.set(bean,propertyValue.getValue());
        }
    }
}