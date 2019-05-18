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

    //查询一条记录
    ProductCategory findOne(Integer integer);

    //查询所有记录
    List<ProductCategory> findAll();

    //查询类目
    List<ProductCategory> findByCategoryTypeIn(List<Integer> typeList);

    //类目表示
    ProductCategory save(ProductCategory productCategory);

    //暂时没有删除方法

}
