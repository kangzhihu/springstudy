package com.coldfire.spring.reader;

import com.coldfire.spring.BeanDefinition;
import com.coldfire.spring.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;17:16<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;abs解析器<br/><br/>
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinetionReader {

    //保存所有解析的bean
    private Map<String,BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
