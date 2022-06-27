package com.gin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/27 16:13
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrdersApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrdersApplication.class,args);
    }
}
