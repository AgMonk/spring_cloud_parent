package com.gin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/27 16:59
 **/
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    public static final String ORDERS = "ORDERS";
    private final RestTemplate restTemplate;
    private final LoadBalancerClient loadBalancerClient;

    private final DiscoveryClient discoveryClient;

    /**
     * 使用 ribbon 服务名 + restTemplate + 负载均衡 对服务间通信
     * @return String
     */
    @RequestMapping("invoke")
    public String invoke() {
        final String s = restTemplate.getForObject("http://" + ORDERS + "/order/demo", String.class);
        System.out.println("s = " + s);
        return "invoke: "+s;
    }
}
