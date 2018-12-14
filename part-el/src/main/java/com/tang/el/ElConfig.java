package com.tang.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import java.io.IOException;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 17:12
 * @Version 1.0
 **/
@Component
@PropertySource("classpath:config.properties")
public class ElConfig {

    @Value("this is normal value")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    /**
     * 引用其他类的属性值
     */
    @Value("#{demoService.definedValue}")
    private String formAnother;

    /**
     * 读入文本文件
     */
    @Value("classpath:testFile.txt")
    private Resource testFile;

    /**
     * 存储请求返回信息
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfiguration(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(formAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("age"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
