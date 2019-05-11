package com.example.sell.controller;

import com.example.sell.viewobject.MessageObject;
import com.example.sell.viewobject.ProductInfoViewObject;
import com.example.sell.viewobject.ProductViewObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BugerProductController
 * @Author nihui
 * @Date 2019/5/11 17:03
 * @Version 1.0
 * @Description 买家商品相关
 */
@RestController
@RequestMapping("/buyer/product")
public class BugerProductController {

    @GetMapping("/list")
    public MessageObject list(){
        //1.查询上架商品

        //2.查询类目（一次性查询）

        //3.数据拼装

        MessageObject messageObject = new MessageObject();
        messageObject.setCode("1");
        messageObject.setMessage("成功");
        ProductViewObject productViewObject = new ProductViewObject();
        productViewObject.setCategoryName("热销");
        productViewObject.setCategoryType(2);


        List<ProductInfoViewObject> productInfoViewObjects = new ArrayList<>();


        ProductInfoViewObject productInfoViewObject = new ProductInfoViewObject();
        productInfoViewObject.setProductId("123");
        productInfoViewObject.setProductName("烧麦");
        productInfoViewObject.setProductDescription("非常好吃");
        productInfoViewObject.setProductPrice(new BigDecimal(34.4));
        productInfoViewObject.setProductIcon("http://jpg");
        productInfoViewObjects.add(productInfoViewObject);


        productViewObject.setProductInfoViewObjectList(productInfoViewObjects);
        messageObject.setDate(productViewObject);


        return messageObject;
    }
}
