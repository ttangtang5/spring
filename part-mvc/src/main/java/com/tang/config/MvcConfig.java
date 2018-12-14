package com.tang.config;

import com.tang.interceptor.ReqHandlerTimeInterceptor;
import com.tang.interceptor.TimeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description 配置mvc的配置 一些mvc配置 必须通过重写方法实现 一定要记得开enableWebMvc注解
 * @Author RLY
 * @Date 2018/12/12 10:57
 * @Version 1.0
 **/
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

    /**
     * 配置添加静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * <mvc:resources location="classpath:/static/" mapping="/static/**"/>
         * 前面部分相当于mapping部分 后面部分相当于location
         * addResourceHandler指对外访问暴露的路径，addResourceLocations指的是文件放置的目录
         */
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public ReqHandlerTimeInterceptor getReqHandlerTimeInterceptor(){
        return new ReqHandlerTimeInterceptor();
    }

    @Bean
    public TimeInterceptor getTimeInterceptor(){
        return new TimeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(getReqHandlerTimeInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(getTimeInterceptor()).addPathPatterns("/*");
        super.addInterceptors(registry);
    }

    /**
     * 等同于无业务逻辑处理的controller的单纯页面范围
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /**
         * addViewController 相当于 requestMapping内容
         * setViewName 相当返回的页面设置
         */
        registry.addViewController("/page").setViewName("index");
        super.addViewControllers(registry);
    }
}
