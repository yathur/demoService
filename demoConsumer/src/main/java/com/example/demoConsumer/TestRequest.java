package com.example.demoConsumer;

import com.example.demoConsumer.Feign.Test;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestRequest {
    @Resource
    private Test test;
    @GetMapping("/hello")
    public String test2(){
        return test.myTest();
    }
    @GetMapping("/hello2")
    public String test3(){
        return test.myTest2();
    }
    @GetMapping("/hello3")
    @HystrixCommand(fallbackMethod = "test5")
    public String test4(){
        throw new RuntimeException("1");
    }
    public String test5(){
        return "test5";
    }
}
