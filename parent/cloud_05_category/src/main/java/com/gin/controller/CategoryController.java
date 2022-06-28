package com.gin.controller;

import com.gin.feignclient.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 15:10
 **/
@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final ProductClient productClient;

    @Value("${server.port}")
    private int port;

    @GetMapping("/category")
    public String product() {
        System.out.println("port = " + port);

        final String product = productClient.product();
        System.out.println("product = " + product);
        return "类别服务: " + port;
    }
}
