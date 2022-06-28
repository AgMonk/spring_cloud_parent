package com.gin.feignclient;

import com.gin.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 15:16
 **/
@FeignClient(value = "PRODUCT")
public interface ProductClient {

    @GetMapping("/product")
    String product();

    @GetMapping("/qs")
    String qs(@RequestParam String name,@RequestParam Integer age);

    @GetMapping("/path/{name}/{age}")
    String path(@PathVariable String name, @PathVariable Integer age);

    @PostMapping("obj")
    String obj(@RequestBody Product product);

    @GetMapping("array")
    String array(@RequestParam String[] ids);
}
