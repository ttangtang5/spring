package com.tang.service.impl;

import com.tang.pojo.User;
import com.tang.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 11:10
 * @Version 1.0
 **/
//@Component
public class UserServiceImpl implements UserService {

    @Override
    public void login(User user) {
        System.out.println("loading...");
    }
}
