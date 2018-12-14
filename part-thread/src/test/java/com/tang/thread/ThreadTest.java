package com.tang.thread;

import com.tang.task.AsyncTaskService;
import com.tang.utils.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.Lock;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 11:36
 * @Version 1.0
 **/
public class ThreadTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        AsyncTaskService taskService = applicationContext.getBean(AsyncTaskService.class);
        for(int i = 0; i < 10; i++){
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTaskPlus(i);
        }
        applicationContext.close();
    }
}
