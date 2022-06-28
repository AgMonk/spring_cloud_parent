package com.gin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 15:06
 **/
@RestController
public class ProductController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/product")
    public String product() {
        System.out.println("port = " + port);

        return "商品服务: " + port;
    }
}
