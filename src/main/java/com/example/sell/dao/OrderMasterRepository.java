package com.example.sell.dao;

import com.example.sell.bean.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Interface OrderMasterRepository
 * @Author nihui
 * @Date 2019/5/18 18:42
 * @Version 1.0
 * @Description TODO
 */
public interface OrderMasterRepository  extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
