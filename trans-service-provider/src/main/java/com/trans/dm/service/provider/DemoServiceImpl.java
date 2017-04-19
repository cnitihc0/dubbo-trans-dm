package com.trans.dm.service.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.trans.dm.service.api.DemoService;

/**
 * @author mashaobo
 * @date 17/3/22
 * @blog http://blog.csdn.net/cnitihc0
 * @email cnitihc0@163.com
 */
@Service(interfaceClass=DemoService.class)
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
