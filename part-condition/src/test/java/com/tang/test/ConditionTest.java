package com.tang.test;

import com.tang.service.SystemService;
import com.tang.utils.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 14:34
 * @Version 1.0
 **/
public class ConditionTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        SystemService systemService = applicationContext.getBean(SystemService.class);
        systemService.showSysMsg();
    }
}
