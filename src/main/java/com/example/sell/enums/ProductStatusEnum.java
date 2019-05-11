package com.example.sell.enums;

import lombok.Getter;

/**
 * @ClassName ProductStatusEnum
 * @Author nihui
 * @Date 2019/5/11 16:40
 * @Version 1.0
 * @Description 商品状态
 */
@Getter
public enum  ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;
    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message =message;
    }


}
