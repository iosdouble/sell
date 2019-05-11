package com.example.sell.service.impl;

import com.example.sell.bean.ProductInfo;
import com.example.sell.enums.ProductStatusEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InfoServiceImplTest {

    @Autowired
    private InfoServiceImpl infoService;

    @Test
    public void findOne() {
        ProductInfo one = infoService.findOne("456");
        System.out.println(one.getProductId());
        assertEquals("456",one.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = infoService.findUpAll();
        assertNotEquals(0,upAll.size());
    }


    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> all = infoService.findAll(pageRequest);

        System.out.println(all.getTotalElements());
        System.out.println(all.getTotalPages());

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("456");
        productInfo.setProductName("烧烤");
        productInfo.setProductPrice(new BigDecimal(3.4));
        productInfo.setProductStock(12);
        productInfo.setProductDescription("多放孜然");
        productInfo.setProductIcon("http://jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo save = infoService.save(productInfo);
        assertNotEquals(null,save);
    }
}