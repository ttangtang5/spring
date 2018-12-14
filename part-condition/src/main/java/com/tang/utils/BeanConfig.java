package com.tang.utils;

import com.tang.condition.LinuxCondition;
import com.tang.condition.WindowsCondition;
import com.tang.service.SystemService;
import com.tang.service.impl.LinuxService;
import com.tang.service.impl.WindowsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 通过@condition 自定义实现bean的创建
 * ConditionalOnBean（仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
 * ConditionalOnClass（该注解的参数对应的类必须存在，否则不解析该注解修饰的配置类；）
 * ConditionalOnExpression（当表达式为true的时候，才会实例化一个Bean）
 * ConditionalOnMissingBean（仅仅在当前上下文中不存在某个对象时，才会实例化一个Bean）
 * ConditionalOnMissingClass（某个class类路径上不存在的时候，才会实例化一个Bean）
 * ConditionalOnNotWebApplication（不是web应用）
 * @Author RLY
 * @Date 2018/12/11 14:29
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = {"com.tang"})
public class BeanConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public SystemService getSystemServiceWin(){
        return new WindowsService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public SystemService getSystemServiceLinux(){
        return new LinuxService();
    }
}
