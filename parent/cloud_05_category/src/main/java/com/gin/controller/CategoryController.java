package com.gin.controller;

import com.gin.entity.Product;
import com.gin.feignclient.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.aop.config.PointcutComponentDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/qs")
    public String qs(String name,
                     Integer age){
        final String res = productClient.qs(name, age);

        return res;
    }

    @GetMapping("/path/{name}/{age}")
    public String path(@PathVariable String name, @PathVariable Integer age){
        return productClient.path(name, age);
    }

    @GetMapping("obj")
    public String obj(){
        return productClient.obj(new Product(1,"名称",1.2,11111L));
    }

    @GetMapping("array")
    public String array(){
        return productClient.array(new String[]{"1","3","2"});
    }

    @GetMapping("getProduct")
    public Product getProduct(Integer id){
        return productClient.getProduct(id);
    }
}
