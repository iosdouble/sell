package com.example.sell.viewobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName ProductInfoViewObject
 * @Author nihui
 * @Date 2019/5/11 17:23
 * @Version 1.0
 * @Description 前端商品详情
 */
@Data
public class ProductInfoViewObject {

    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("descrption")
    private String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}

