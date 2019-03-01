package com.fcb.servicehelloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String home(@RequestParam(value = "name", defaultValue = "fcb")String name){
        return "hello " + name + ",i am from port " + port;
    }
}
