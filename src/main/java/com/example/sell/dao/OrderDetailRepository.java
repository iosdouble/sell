package com.example.sell.dao;

import com.example.sell.bean.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Interface OrderDetailRepository
 * @Author nihui
 * @Date 2019/5/18 18:47
 * @Version 1.0
 * @Description TODO
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
 List<OrderDetail> findByOrderId(String orderId);
}
