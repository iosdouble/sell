package com.example.sell.service.impl;

import com.example.sell.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
       assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> integerList = Arrays.asList(2,3,9);
        List<ProductCategory> productCategoryByCategoryType = categoryService.findByCategoryTypeIn(integerList);
       assertNotEquals(0,productCategoryByCategoryType.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("共享专区",5);
        ProductCategory save = categoryService.save(productCategory);
        assertNotEquals(null,save);
    }
}