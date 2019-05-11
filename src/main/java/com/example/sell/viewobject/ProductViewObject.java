package com.example.sell.viewobject;

import com.example.sell.bean.ProductInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName ProductView
 * @Author nihui
 * @Date 2019/5/11 17:19
 * @Version 1.0
 * @Description 商品在用户页面上需要展示的对象
 */
@Data
public class ProductViewObject {

    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoViewObject> productInfoViewObjectList;
}
