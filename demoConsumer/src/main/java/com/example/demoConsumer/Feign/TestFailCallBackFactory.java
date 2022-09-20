package com.example.demoConsumer.Feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TestFailCallBackFactory implements FallbackFactory<Test> {
    @Override
    public Test create(Throwable throwable) {
        return new Test() {
            @Override
            public String myTest1() {
                return null;
            }

            @Override
            public String myTest() {
                return "myTest";
            }

            @Override
            public String myTest2() {
                return "myTest2";
            }
        };
    }
}
