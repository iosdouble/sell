package com.example.sell.dao;

import com.example.sell.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("ta的最爱");
//        productCategory.setCategoryType(3);
//        repository.save(productCategory);
    }

    @Test
//    @Transactional
    public void updateTest(){

//        ProductCategory productCategory = repository.findOne(2);
//        productCategory.setCategoryType(9);
//        repository.save(productCategory);


        ProductCategory productCategory1 = new ProductCategory("喜欢",3);

        ProductCategory result = repository.save(productCategory1);

        Assert.assertNotNull(result);


//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("我最喜欢");
//        productCategory.setCategoryType(2);
//        repository.save(productCategory);
    }

    @Test
    public void findType(){
        List<Integer> integerList = Arrays.asList(2,3,9);

        List<ProductCategory> productCategoryByCategoryType = repository.findByCategoryTypeIn(integerList);

        Assert.assertNotEquals(0,productCategoryByCategoryType.size());
        for(ProductCategory p: productCategoryByCategoryType){
            System.out.println(p.toString());
        }
    }
}