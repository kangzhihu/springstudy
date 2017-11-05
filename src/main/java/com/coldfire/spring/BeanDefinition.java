package com.coldfire.spring;

import com.coldfire.spring.model.PropertyValues;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-10-08&nbsp;17:21<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;单个bean配置类<br/><br/>
 */
public class BeanDefinition {

    //bean 对象
    private Object bean;

    //bean 类
    private Class beanClass;

    //类名
    private String beanClassName;

    //属性
    private PropertyValues pv = new PropertyValues();

    public BeanDefinition() {
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
        this.beanClassName = beanClass.getCanonicalName();
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    //初始化name时一起初始化类信息
    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public PropertyValues getPropertyValues() {
        return pv;
    }

    public void setPropertyValues(PropertyValues pv) {
        this.pv = pv;
    }
}
