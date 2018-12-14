package com.tang.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 16:21
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.tang")
@EnableAspectJAutoProxy
public class AopConfig {
}
