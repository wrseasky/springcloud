package com.springcloud.controller;

import com.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name){
        System.out.println("aaaa");
        return helloService.hiService(name);
    }

}
