package com.tang.service.impl;

import com.tang.service.SystemService;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 14:26
 * @Version 1.0
 **/
public class WindowsService implements SystemService{

    @Override
    public void showSysMsg() {
        System.out.println("this is the windows system");
    }
}
