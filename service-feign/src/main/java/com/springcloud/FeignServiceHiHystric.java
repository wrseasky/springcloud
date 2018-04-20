package com.springcloud;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHiHystric implements FeignServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry   " + name;
    }
}
