package com.example.sell.dao;

import com.example.sell.bean.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Interface ProductInfoRepository
 * @Author nihui
 * @Date 2019/5/11 16:24
 * @Version 1.0
 * @Description TODO
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
