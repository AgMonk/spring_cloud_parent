package com.gin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 09:41
 **/
@Configuration
public class BeansConfig {



    /**
     * 创建一个具有负载均衡特性的 restTemplate 请求对象
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
