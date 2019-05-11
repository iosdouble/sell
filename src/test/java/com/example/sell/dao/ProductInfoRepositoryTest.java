package com.example.sell.dao;

import com.example.sell.bean.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void testMain() {
        ProductInfo productInfo = new ProductInfo();

        productInfo.setProductId("123");
        productInfo.setProductName("黄焖鸡");
        productInfo.setProductPrice(new BigDecimal(3.4));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("非常辣");
        productInfo.setProductIcon("http://jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        productInfoRepository.save(productInfo);
    }
}