package com.tang.pojo;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 9:57
 * @Version 1.0
 **/
@Component
public class DemoBean {

    private String msg;

    public DemoBean(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public DemoBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
