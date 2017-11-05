package com.coldfire.spring.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;16:10<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;一个配置对象的所有属性<br/><br/>
 * 为什么封装而不是直接用List?因为可以封装一些操作.
 */
public class PropertyValues {

    private List<PropertyValue> properties = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.properties.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.properties;
    }


}
