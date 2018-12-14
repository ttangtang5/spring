package com.tang.controller;

import com.tang.pojo.User;
import com.tang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 11:15
 * @Version 1.0
 **/
public class UserController2 {

    private UserService userService;

    public String login(User user){
        userService.login(user);
        return "";
    }

    public UserController2 setUserService(UserService userService) {
        this.userService = userService;
        return this;
    }
}
