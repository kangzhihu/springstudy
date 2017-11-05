package com.coldfire.service.impl;

import com.coldfire.service.HelloService;

/**
 * Author: zhihu.kang<br/>
 * Data: 2017-11-05&nbsp;15:38<br/>
 * Email: kangzhihu@163.com<br/>
 * Description:<br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;service impl<br/><br/>
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name){
        return name+" say hello!";
    }
}
