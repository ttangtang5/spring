package com.tang.controller;

import com.tang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/12 15:22
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public Object sayHello(String name) {
        helloService.show();
        System.out.println("name: " + name);
        return "hello " + name;
    }

}
