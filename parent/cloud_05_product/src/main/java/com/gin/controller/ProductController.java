package com.gin.controller;

import com.gin.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

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
    @PostMapping("obj")
    public String obj(@RequestBody Product product){
        log.info("{}",product);
        return "对象参数： "+port;
    }

    @GetMapping("array")
    public String array(String[] ids){
        log.info("{}", List.of(ids));
        return "array: "+port;
    }

    @GetMapping("getProduct")
    public Product getProduct(Integer id){
        final Product product = new Product();
        product.setId(id);
        product.setName("商品名称");
        product.setTimeCreated(ZonedDateTime.now().toEpochSecond());
        System.out.println("id = " + id);
        return product;
    }
}
