package com.tang.test;

import com.tang.scheduling.ScheduledTaskService;
import com.tang.utils.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 13:58
 * @Version 1.0
 **/
public class Scheduling {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
    }
}
