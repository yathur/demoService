package com.example.demoConsumer.Feign;

import org.springframework.stereotype.Component;

@Component
public class TestFallCallBack implements Test{
    @Override
    public String myTest() {
        return "mytest-";
    }

    @Override
    public String myTest2() {
        return "mytest2-";
    }

    @Override
    public String myTest1() {
        return null;
    }
}
