package com.coldfire.spring;

import com.coldfire.model.Person;
import com.coldfire.service.HelloService;
import com.coldfire.service.impl.HelloServiceImpl;
import com.coldfire.spring.factory.AutowireCapableBeanFactory;
import com.coldfire.spring.factory.BeanFactory;
import com.coldfire.spring.model.PropertyValue;
import com.coldfire.spring.model.PropertyValues;
import org.junit.Test;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;15:33<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;简单测试<br/><br/>
 */

public class SimpleTest {

    @Test
    public void testBean(){
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClass(HelloServiceImpl.class);
        beanDefinition.setBeanClassName(HelloServiceImpl.class.getName());

        PropertyValues propertyValues = new PropertyValues();
        PropertyValue propertyValue= new PropertyValue("text","haha");
        Person person = new Person();
        person.setName("zhangsan");person.setAge(20);
        PropertyValue propertyValue1= new PropertyValue("person",person);
        propertyValues.addPropertyValue(propertyValue);
        propertyValues.addPropertyValue(propertyValue1);

        beanDefinition.setPropertyValues(propertyValues);
        beanFactory.registerBeanDefinition("helloService",beanDefinition);
        HelloService helloService = (HelloService)beanFactory.getBean("helloService");
        System.out.println(helloService.sayHello("kzh"));
    }
}
