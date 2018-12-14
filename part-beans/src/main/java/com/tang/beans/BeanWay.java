package com.tang.beans;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 9:15
 * @Version 1.0
 **/
public class BeanWay {

    int i = 0;

    public void init(){
        //System.out.println("bean method init");
        System.out.println("bean init:" + ++i);
    }

    public BeanWay(){
        System.out.println("bean construct:" + ++i);
        //System.out.println("构造函数");
    }

    public void destroy(){
        System.out.println("bean method destroy");
    }
}
