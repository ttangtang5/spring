package com.tang.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description 自定义拦截器实现HandlerInterceptor 或继承HandlerInterceptorAdapter
 *  preHandler() - 在实际的handler被执行前被调用
 *  postHandler() - 在handler被执行后被调用
 *  afterCompletion() - 当request处理完成后被调用
 * @Author RLY
 * @Date 2018/12/12 11:32
 * @Version 1.0
 **/
public class ReqHandlerTimeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        long time = System.currentTimeMillis();
        request.setAttribute("startTime", time);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        long startTime = (long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("请求处理时间：" + new Long(endTime - startTime) + "ms");
        request.removeAttribute("startTime");
        request.setAttribute("handlerTime", endTime - startTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
