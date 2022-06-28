package com.gin.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 15:16
 **/
@FeignClient(value = "PRODUCT")
public interface ProductClient {

    @GetMapping("/product")
    String product();
}
