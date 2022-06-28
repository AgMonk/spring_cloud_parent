package com.gin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : ginstone
 * @version : v1.0.0
 * @since : 2022/6/28 16:29
 **/
@Data
@AllArgsConstructor
public class Product {
    Integer id;
    String name;
    Double price;
    Long timeCreated;
}
