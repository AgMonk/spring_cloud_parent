package com.gin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/27 16:57
 **/
@RestController
@RequestMapping("order")
public class OrderController {

    @RequestMapping("demo")
    public String demo(){
        System.out.println("test");
        return "Hello World";
    }
}
