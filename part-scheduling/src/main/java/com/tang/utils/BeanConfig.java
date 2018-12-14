package com.tang.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 13:57
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = {"com.tang"})
@EnableScheduling
public class BeanConfig {

}
