package com.gin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.DirectColorModel;
import java.util.List;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/27 16:59
 **/
@RestController
@RequestMapping("user")
public class UserController {


    private final DiscoveryClient discoveryClient;

    public UserController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }


    @RequestMapping("invoke")
    public String invoke() {

        final List<ServiceInstance> serviceInstances = discoveryClient.getInstances("consul-orders");



        System.out.println("invoke");
        return "invoke";
    }
}
