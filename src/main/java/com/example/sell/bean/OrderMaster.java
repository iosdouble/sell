package com.example.sell.bean;

import com.example.sell.enums.OrderStatusEnum;
import com.example.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderMaster
 * @Author nihui
 * @Date 2019/5/18 18:26
 * @Version 1.0
 * @Description
 *
 * 订单实体
 */
@Entity
@Data
@DynamicUpdate //自动更新时间
public class OrderMaster {

    /*订单ID*/
    @Id
    private String orderId;

    /*买家名字*/
    private String buyerName;

    /*买家手机号*/

    private String buyerPhone;

    /*买家地址*/
    private String buyerAddress;

    /*买家OpenID*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态。默认状态为新订单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /*支付状态 默认为等待支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /*创建时间 */
    private Date createTime;

    /*更新时间*/
    private Date updateTime;

}
