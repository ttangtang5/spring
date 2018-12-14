package com.tang.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description 通过jsr-250 注解bean的初始化(@PostConstruct)和销毁方法(@PreDestroy)
 * @Author RLY
 * @Date 2018/12/11 9:18
 * @Version 1.0
 **/
public class AnnotationWay {

    int i = 0;

    @PostConstruct
    public void init(){
        //System.out.println("annotation bean init");
        System.out.println("annotation:" + ++i);
    }

    public AnnotationWay(){
        System.out.println("annotation construct:" + ++i);
        //System.out.println("注解方式的构造函数");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("annotation bean destroy");
    }
}
