package com.tang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 16:21
 * @Version 1.0
 **/
@Controller
public class IndexController {

    @RequestMapping("/simpleton")
    public String index2(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return "index";
    }
}
