package com.laoshiren.hello.sentinel.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProjectName:     hello-sentinel
 * Package:         com.laoshiren.hello.sentinel.provider
 * ClassName:       ProviderApplication
 * Author:          laoshiren
 * Description:
 * Date:            2020/8/2 11:19
 * Version:         1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }

}