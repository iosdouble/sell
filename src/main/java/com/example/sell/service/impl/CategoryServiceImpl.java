package com.example.sell.service.impl;

import com.example.sell.bean.ProductCategory;
import com.example.sell.dao.ProductCategoryRepository;
import com.example.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Author nihui
 * @Date 2019/5/11 16:09
 * @Version 1.0
 * @Description TODO
 */
@Service
public class CategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;
    @Override
    public ProductCategory findOne(Integer integer) {
        return productCategoryRepository.findOne(integer);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> typeList) {
        return productCategoryRepository.findByCategoryTypeIn(typeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }
}
