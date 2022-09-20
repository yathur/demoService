package com.example.demoConsumer.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "demoServiceProvider",fallback = TestFallCallBack.class)
public interface Test {
    @GetMapping("/aa")
    String myTest();
    @GetMapping("/ab")
    String myTest2();
    @GetMapping("/ac")
    String myTest1();

}

