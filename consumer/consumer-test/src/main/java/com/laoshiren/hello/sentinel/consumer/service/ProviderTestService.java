package com.laoshiren.hello.sentinel.consumer.service;

import com.laoshiren.hello.sentinel.consumer.service.fallback.ProviderTestServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ProjectName:     hello-sentinel
 * Package:         com.laoshiren.hello.sentinel.consumer.service
 * ClassName:       ProviderTestService
 * Author:          laoshiren
 * Description:
 * Date:            2020/8/2 12:06
 * Version:         1.0
 */
@FeignClient(value = "provider-test",fallback = ProviderTestServiceFallBack.class)
public interface ProviderTestService {

    @GetMapping("provider/test/{name}")
    String test(@PathVariable(value = "name")String name);

}
