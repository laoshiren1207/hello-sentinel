package com.laoshiren.hello.sentinel.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ProjectName:     hello-sentinel
 * Package:         com.laoshiren.hello.sentinel.consumer
 * ClassName:       ConsumerApplication
 * Author:          laoshiren
 * Description:
 * Date:            2020/8/2 12:04
 * Version:         1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

}
