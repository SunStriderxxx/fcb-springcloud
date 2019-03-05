package com.fcb.servicefeign.service.impl;

import com.fcb.servicefeign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: Fcb
 * @Date: 2019/3/4
 * @Description: HelloService的降级服务
 */
@Component
public class HelloServiceHyStric implements HelloService {
    @Override
    public String helloFromClientOne(String name) {
        return "sorry " + name;
    }
}
