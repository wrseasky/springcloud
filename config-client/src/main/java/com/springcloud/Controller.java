package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controller {

    @Value("${foo}")
    String foo;

    @Value("${democonfigclient.message}")
    String message;


    @RequestMapping("/hi")
    public String hi(){
        return "foo: " + foo + "\r\n" + "message: " + message + "\r\n";
    }

}
