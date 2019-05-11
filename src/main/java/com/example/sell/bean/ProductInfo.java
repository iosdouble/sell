package com.example.sell.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName ProductInfo
 * @Author nihui
 * @Date 2019/5/11 16:19
 * @Version 1.0
 * @Description TODO
 * 商品类对象
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    //名称
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;
    //状态 0正常，1表示下架
    private Integer productStatus;

    private Integer categoryType;


}
