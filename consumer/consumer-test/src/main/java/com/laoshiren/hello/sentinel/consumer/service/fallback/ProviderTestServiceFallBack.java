package com.laoshiren.hello.sentinel.consumer.service.fallback;

import com.laoshiren.hello.sentinel.consumer.service.ProviderTestService;
import org.springframework.stereotype.Component;

/**
 * ProjectName:     hello-sentinel
 * Package:         com.laoshiren.hello.sentinel.consumer.service.fallback
 * ClassName:       ProviderTestServiceFallBack
 * Author:          laoshiren
 * Description:
 * Date:            2020/8/2 12:13
 * Version:         1.0
 */
@Component
public class ProviderTestServiceFallBack implements ProviderTestService {

    @Override
    public String test(String name) {
        return " fallback 服务熔断 "+name;
    }
}
