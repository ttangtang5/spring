package com.tang.service;

import com.tang.utils.Action;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 16:07
 * @Version 1.0
 **/
@Service
public class AnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){}
}
