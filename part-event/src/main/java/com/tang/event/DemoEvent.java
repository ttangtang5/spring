package com.tang.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Description
 * spring 事件：
 *  1、自定义事件，继承ApplicationEvent.
 *  2、定义事件监听器，实现ApplicationListener
 *  3、使用容器发布事件
 * @Author RLY
 * @Date 2018/12/11 10:43
 * @Version 1.0
 **/
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public DemoEvent setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
