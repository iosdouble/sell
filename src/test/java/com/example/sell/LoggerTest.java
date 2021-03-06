package com.example.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName LoggerTest
 * @Author nihui
 * @Date 2019/5/8 22:53
 * @Version 1.0
 * @Description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void testMain(){
        String name = "nihui";
        String password = "123123";

        log.debug("debug.....");
        log.error("error....");
        log.info("info....");

        log.info("name"+name+"password"+password);

        log.info("name : {},password {}",name,password);
    }
}
