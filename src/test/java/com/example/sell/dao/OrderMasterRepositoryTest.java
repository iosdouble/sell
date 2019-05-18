package com.example.sell.dao;

import com.example.sell.bean.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private  OrderMasterRepository orderMasterRepository;

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1");
        orderMaster.setBuyerName("倪辉");
        orderMaster.setBuyerOpenid("123");
        orderMaster.setBuyerPhone("12312312311");
        orderMaster.setBuyerAddress("CSDN");
        orderMaster.setOrderId("123123");
        orderMaster.setOrderAmount(new BigDecimal(12312.223));


        OrderMaster result = orderMasterRepository.save(orderMaster);

        Assert.assertNotEquals(result,null);

    }
    @Test
    public void findByBuyerOpenid() {
    }
}