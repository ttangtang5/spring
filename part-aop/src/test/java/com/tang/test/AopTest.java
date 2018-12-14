package com.tang.test;

import com.tang.service.AnnotationService;
import com.tang.service.DemoMethodService;
import com.tang.utils.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 16:22
 * @Version 1.0
 **/
public class AopTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        AnnotationService annotationService = applicationContext.getBean(AnnotationService.class);
        DemoMethodService methodService = applicationContext.getBean(DemoMethodService.class);

        annotationService.add();

        methodService.add();

        applicationContext.close();
    }
}
