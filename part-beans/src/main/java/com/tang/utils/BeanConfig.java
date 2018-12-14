package com.tang.utils;

import com.tang.beans.AnnotationWay;
import com.tang.beans.BeanWay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 9:22
 * @Version 1.0
 **/
@Configuration
public class BeanConfig {

    @Bean
    public AnnotationWay getAnnotationWay(){
        return new AnnotationWay();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWay getBeanWay(){
        return new BeanWay();
    }
}
