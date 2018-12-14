package com.tang.service.impl;

import com.tang.pojo.User;
import com.tang.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 11:10
 * @Version 1.0
 **/
public class UserServiceImpl2 implements UserService {

    @Override
    public void login(User user) {
        System.out.println("loading...");
    }
}
