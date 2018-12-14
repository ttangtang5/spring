package com.tang.utils;

import com.tang.controller.UserController;
import com.tang.controller.UserController2;
import com.tang.service.UserService;
import com.tang.service.impl.UserServiceImpl;
import com.tang.service.impl.UserServiceImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 类配置bean
 * @Author RLY
 * @Date 2018/12/10 15:10
 * @Version 1.0
 **/
@Configuration
public class BeanTestConfig {

    @Bean
    public UserService getUserService(){
        return new UserServiceImpl2();
    }

    @Bean
    public UserController2 getUserController(){
        UserController2 userController2 = new UserController2();
        userController2.setUserService(this.getUserService());
        return userController2;
    }
}
