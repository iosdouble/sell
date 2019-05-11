package com.example.sell.service;

import com.example.sell.bean.ProductCategory;

import java.util.List;

/**
 * @ClassName ProductCategoryService
 * @Author nihui
 * @Date 2019/5/11 16:06
 * @Version 1.0
 * @Description TODO
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer integer);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> typeList);

    ProductCategory save(ProductCategory productCategory);

    //暂时没有删除方法

}
