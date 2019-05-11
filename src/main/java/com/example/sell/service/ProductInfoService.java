package com.example.sell.service;

import com.example.sell.bean.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Interface ProductInfoService
 * @Author nihui
 * @Date 2019/5/11 16:35
 * @Version 1.0
 * @Description TODO
 */
public interface ProductInfoService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
//    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
//    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
//    ProductInfo onSale(String productId);

    //下架
//    ProductInfo offSale(String productId);


}
