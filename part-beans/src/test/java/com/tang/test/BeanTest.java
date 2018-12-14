package com.tang.test;

import com.tang.beans.AnnotationWay;
import com.tang.beans.BeanWay;
import com.tang.utils.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 9:25
 * @Version 1.0
 **/
public class BeanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        AnnotationWay annotationWay = applicationContext.getBean(AnnotationWay.class);
        BeanWay beanWay = applicationContext.getBean(BeanWay.class);
    }
}
