package com.gin.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/7/4 12:26
 **/
@Configuration
public class CustomerGlobalFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        final ServerHttpRequest request = exchange.getRequest();
        System.out.println("响应前处理");
        final Mono<Void> filter = chain.filter(exchange);
        final ServerHttpResponse response = exchange.getResponse();
        System.out.println("响应后处理");
        return filter;
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
