package com.gin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 14:55
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CategoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CategoryApplication.class, args);
    }
}
