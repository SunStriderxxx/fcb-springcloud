package com.fcb.servicefeign.service;

import com.fcb.servicefeign.service.impl.HelloServiceHyStric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
  *@Author: Fcb
  *@Date: 2019/3/2 16:20
  *@Description: 调用helloservice
  */
@FeignClient(value = "service-helloworld", fallback = HelloServiceHyStric.class)
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String helloFromClientOne(@RequestParam(value = "name")String name);
}
