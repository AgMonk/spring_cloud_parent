package com.gin.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.reactive.ReactiveLoadBalancer;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 12:42
 **/
public class RandomBalancerClientConfiguration {

   @Bean
    public ReactorLoadBalancer<ServiceInstance> randomBalancer
            (Environment environment, ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider) {
        String name = environment.getProperty("loadbalancer.client.name");
        return new RandomLoadBalancer(serviceInstanceListSupplierProvider, name);
    }
}
