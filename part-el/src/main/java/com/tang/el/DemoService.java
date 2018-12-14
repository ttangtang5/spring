package com.tang.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/10 17:01
 * @Version 1.0
 **/
@Service
public class DemoService {

    @Value("自定义属性值")
    private String definedValue;

    public String getDefinedValue() {
        return definedValue;
    }

    public DemoService setDefinedValue(String definedValue) {
        this.definedValue = definedValue;
        return this;
    }
}
