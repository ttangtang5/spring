package com.tang.test;

import com.tang.el.DemoService;
import com.tang.el.ElConfig;
import com.tang.utils.ResourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 17:08
 * @Version 1.0
 **/
public class ElTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ResourceConfig.class);
        ElConfig elConfig = applicationContext.getBean(ElConfig.class);
        elConfig.outputResource();
        applicationContext.close();
    }
}
