package com.tang.test;

import com.tang.controller.UserController;
import com.tang.controller.UserController2;
import com.tang.pojo.User;
import com.tang.service.UserService;
import com.tang.utils.BeanConfig;
import com.tang.utils.BeanTestConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 11:20
 * @Version 1.0
 **/
public class SpringTest {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.tang");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanTestConfig.class);
        UserController2 user = annotationConfigApplicationContext.getBean(UserController2.class);
        user.login(new User());
        annotationConfigApplicationContext.close();

    }
}
