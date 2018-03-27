package com.springcloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(String name){
        return "hi" + name + ", i am from port " + port;
    }

}
