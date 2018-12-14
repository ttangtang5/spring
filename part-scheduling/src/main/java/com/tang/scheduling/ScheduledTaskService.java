package com.tang.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/11 13:47
 * @Version 1.0
 **/
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void printDate(){
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 02 14 ? * *")
    public void fixTimeExecution(){
        System.out.println("现在是特殊时间：" + dateFormat.format(new Date()));
    }
}
