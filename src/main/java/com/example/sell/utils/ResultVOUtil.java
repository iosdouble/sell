package com.example.sell.utils;

import com.example.sell.viewobject.MessageObject;

/**
 * @ClassName ResultVOUtil
 * @Author nihui
 * @Date 2019/5/18 18:13
 * @Version 1.0
 * @Description TODO
 */
public class ResultVOUtil {
    public static MessageObject success(Object object){
        MessageObject messageObject = new MessageObject();
        messageObject.setDate(object);
        messageObject.setCode(0);
        messageObject.setMessage("success");
        return messageObject;
    }

    public static MessageObject success(){
        return success(null);
    }

    public static MessageObject error(Integer code ,String msg){
        MessageObject messageObject = new MessageObject();
        messageObject.setMessage(msg);
        messageObject.setDate(null);
        messageObject.setCode(code);
        return  messageObject;
    }
}
