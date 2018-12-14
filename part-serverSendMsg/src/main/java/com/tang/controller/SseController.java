package com.tang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @Description SSE(Server Send Event) 服务端发送事件
 * SSE 是单向通道，只能服务器向客户端发送消息，如果客户端需要向服务器发送消息，则需要一个新的 HTTP 请求。
 * 这对比 WebSocket 的双工通道来说，会有更大的开销。这么一来的话就会存在一个「什么时候才需要关心这个差异？」的问题，
 * 如果平均每秒会向服务器发送一次消息的话，那应该选择 WebSocket。如果一分钟仅 5 - 6 次的话，其实这个差异并不大。
 * @Author RLY
 * @Date 2018/12/14 10:52
 * @Version 1.0
 **/
@Controller
public class SseController {

    /**
     * 注意这里使用输出的媒体类型为：text/event-stream
     * @return
     */
    @RequestMapping(value = "/push", produces = "text/event-stream;charset=utf-8")
    @ResponseBody
    public String pushMsg(){
        Random random = new Random();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + random.nextInt() + "\n\n";
    }

}
