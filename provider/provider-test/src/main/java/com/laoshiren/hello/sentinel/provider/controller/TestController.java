package com.laoshiren.hello.sentinel.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectName:     hello-sentinel
 * Package:         com.laoshiren.hello.sentinel.provider.controller
 * ClassName:       TestController
 * Author:          laoshiren
 * Description:
 * Date:            2020/8/2 11:24
 * Version:         1.0
 */
@RestController
@RequestMapping("provider")
public class TestController {

    @GetMapping("/test/{name}")
    @SentinelResource(value = "test", blockHandler = "blockExceptionHandler")
    public String test(@PathVariable(value = "name") String name){
        System.out.println("provider");
        return "hello "+name+" 这是生产者 ";
    }

    public String blockExceptionHandler(String name ,BlockException e) {
        e.printStackTrace();
        System.out.println("访问过于频繁");
        return name + "访问过于频繁";
    }

}
