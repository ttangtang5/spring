package com.tang.test;

import com.tang.event.DemoPublisher;
import com.tang.utils.EventConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 10:54
 * @Version 1.0
 **/
public class EventTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = applicationContext.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        applicationContext.close();
    }
}
