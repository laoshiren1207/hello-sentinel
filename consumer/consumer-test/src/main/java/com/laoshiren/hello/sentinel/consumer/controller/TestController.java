package com.laoshiren.hello.sentinel.consumer.controller;

import com.laoshiren.hello.sentinel.consumer.service.ProviderTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ProjectName:     hello-sentinel
 * Package:         com.laoshiren.hello.sentinel.consumer.controller
 * ClassName:       TestController
 * Author:          laoshiren
 * Description:
 * Date:            2020/8/2 12:05
 * Version:         1.0
 */
@RestController
public class TestController {

    @Resource
    private ProviderTestService providerTestService;

    @GetMapping(value = "/consumer/test/{name}")
    public String echo(@PathVariable String name) {
        System.out.println("consumer");
        return providerTestService.test(name);
    }

}
