package com.example.sell.dao;

import com.example.sell.bean.ProductCategory;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductCategoryDao
 * @Author nihui
 * @Date 2019/5/11 13:57
 * @Version 1.0
 * @Description TODO
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

   List<ProductCategory> findByCategoryTypeIn (List<Integer> categoryTypeList);
}
