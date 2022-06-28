package com.gin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 15:06
 **/
@RestController
@Slf4j
public class ProductController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/product")
    public String product() {
        System.out.println("port = " + port);

        return "商品服务: " + port;
    }

    @GetMapping("/qs")
    public String qs(String name,Integer age){
      log.info("name:{} age:{}",name,age);
      return "qs -> name: "+name+"age: "+age+" port: "+port;
    }

    @GetMapping("/path/{name}/{age}")
    public String path(@PathVariable String name,@PathVariable Integer age){
        return "path -> name: "+name+"age: "+age+" port: "+port;
    }
}
