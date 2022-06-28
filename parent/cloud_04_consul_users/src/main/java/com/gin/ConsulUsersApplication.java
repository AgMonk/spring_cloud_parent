package com.gin;

import com.gin.config.RandomBalancerClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/27 16:12
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulUsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulUsersApplication.class,args);
    }
}
