package com.example.sell.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName OrderDetail
 * @Author nihui
 * @Date 2019/5/18 18:37
 * @Version 1.0
 * @Description 订单详情表
 *
 */

@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    /* 订单id */
    private String orderId;

    /*商品ID*/
    private String productId;

    /*商品名称*/
    private String productName;

    /*商品单价*/
    private BigDecimal productPrice;

    /*商品数量*/
    private Integer productQuantity;

    /*商品小图*/
    private String productIcon;
}
