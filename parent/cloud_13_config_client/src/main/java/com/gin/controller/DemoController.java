package com.gin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/7/4 15:50
 **/
@RestController
public class DemoController {
    @Value("${name}")
    String name;

    @GetMapping("demo")
    public String demo() {
        System.out.println("name = " + name);
        return "demo ok:" + name;
    }
}
