package com.tang.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 10:47
 * @Version 1.0
 **/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("demoListener 接收到了demoPublisher发布的消息：" + msg);
    }
}
