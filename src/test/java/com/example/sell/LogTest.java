package com.example.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName LogTest
 * @Author nihui
 * @Date 2019/5/8 22:48
 * @Version 1.0
 * @Description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {

    private final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void testMain() {

        logger.debug("debug ...");
        logger.info("info...");
        logger.error("error");
    }


}
