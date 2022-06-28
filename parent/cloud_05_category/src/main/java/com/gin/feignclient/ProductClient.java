package com.gin.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
}
