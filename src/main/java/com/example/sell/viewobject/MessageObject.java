package com.example.sell.viewobject;

import lombok.Data;

/**
 * @ClassName MessageObject
 * @Author nihui
 * @Date 2019/5/11 17:09
 * @Version 1.0
 * @Description HTTP请求返回的最外层的对象
 */
@Data
public class MessageObject<T> {

    //错误提示码
    private Integer code;
    //提示信息
    private String message;
    //具体内容
    private T date;

}
