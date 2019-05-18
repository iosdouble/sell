package com.example.sell.controller;

import com.example.sell.bean.ProductCategory;
import com.example.sell.bean.ProductInfo;
import com.example.sell.service.ProductCategoryService;
import com.example.sell.service.ProductInfoService;
import com.example.sell.utils.ResultVOUtil;
import com.example.sell.viewobject.MessageObject;
import com.example.sell.viewobject.ProductInfoViewObject;
import com.example.sell.viewobject.ProductViewObject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName BugerProductController
 * @Author nihui
 * @Date 2019/5/11 17:03
 * @Version 1.0
 * @Description 买家商品相关
 */
@RestController
@RequestMapping("/buyer/product")
public class BugerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public MessageObject list(){
        //从数据库中查询商品目录
        //1.查询上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2.查询类目（一次性查询）

//        List<Integer> categoryTypeList = new ArrayList<>();
        //传统方法
//        for(ProductInfo productInfo: productInfoList){
//            categoryTypeList.add(productInfo.getCategoryType());
//        }
        //精简方法
        List<Integer> categoryTypeList = productInfoList.stream()
               .map(e->e.getCategoryType())
               .collect(Collectors.toList());

        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据拼装

        List<ProductViewObject> productViewObjectList = new ArrayList<>();

        for(ProductCategory productCategory: productCategoryList){
            ProductViewObject productViewObject = new ProductViewObject();
            productViewObject.setCategoryType(productCategory.getCategoryType());
            productViewObject.setCategoryName(productCategory.getCategoryName());


            List<ProductInfoViewObject> productInfoViewObjectList = new ArrayList<>();

            for(ProductInfo productInfo: productInfoList){
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoViewObject productInfoViewObject = new ProductInfoViewObject();
                    //这个是Spring提供的一个方法，可以将一个对象的属性拷贝的另一个对象中
                    //同样可以使用get set方法进行设置
                    BeanUtils.copyProperties(productInfo,productInfoViewObject);
                    productInfoViewObjectList.add(productInfoViewObject);
                }
            }

            productViewObject.setProductInfoViewObjectList(productInfoViewObjectList);

            productViewObjectList.add(productViewObject);
        }


//        MessageObject messageObject = new MessageObject();
//        messageObject.setCode("1");
//        messageObject.setMessage("成功");
//        ProductViewObject productViewObject = new ProductViewObject();
//        productViewObject.setCategoryName("热销");
//        productViewObject.setCategoryType(2);
//
//
//        List<ProductInfoViewObject> productInfoViewObjects = new ArrayList<>();
//
//
//        ProductInfoViewObject productInfoViewObject = new ProductInfoViewObject();
//        productInfoViewObject.setProductId("123");
//        productInfoViewObject.setProductName("烧麦");
//        productInfoViewObject.setProductDescription("非常好吃");
//        productInfoViewObject.setProductPrice(new BigDecimal(34.4));
//        productInfoViewObject.setProductIcon("http://jpg");
//        productInfoViewObjects.add(productInfoViewObject);
//
//
//        productViewObject.setProductInfoViewObjectList(productInfoViewObjects);
//        messageObject.setDate(productViewObject);
//        messageObject.setDate(productViewObjectList);


//        return messageObject;
        return ResultVOUtil.success(productViewObjectList);
    }
}
