package com.tang.pojo;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 11:12
 * @Version 1.0
 **/
public class User {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
