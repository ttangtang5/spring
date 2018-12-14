package com.tang.utils;

import java.lang.annotation.*;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 16:06
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {

    String name();
}
