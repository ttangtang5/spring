package com.tang.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/14 14:18
 * @Version 1.0
 **/
@Service
public class PushService {

    private DeferredResult<String> deferredResult;

    public DeferredResult<String> getAysncUpdate(){
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 10000)
    public void refresh(){
        if(deferredResult != null){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}
