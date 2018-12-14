package com.tang.utils;

import com.tang.pojo.DemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 9:57
 * @Version 1.0
 **/
@Configuration
public class BeanConfig {

    @Bean
    @Profile("dev")
    public DemoBean getDemoBeanDev(){
        return new DemoBean("configuration dev");
    }

    @Bean
    @Profile("product")
    public DemoBean getDemoBeanProduct(){
        return new DemoBean("configuration product");
    }
}
