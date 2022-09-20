package com.example.demoserviceprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MyTest {
    Logger logger = Logger.getLogger("MyTest");
    @GetMapping("/aa")
    public String test(){
    return "provider 1";
    }
    @GetMapping("/user/{id}")
    public String test2(@PathVariable String id){
        logger.info("test2 "+id);
        return "test2..."+id;
    }
}
