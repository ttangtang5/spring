package com.tang.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author RLY
 * @Date 2018/12/12 15:45
 * @Version 1.0
 **/
@Aspect
@EnableAspectJAutoProxy
@Component
public class TimeAspect {

    // 统配方式
    @Pointcut("execution(* com.tang.service.*.*(..))")
    public void mytime(){}	//当多个同时使用同样的

    //前置
    @Before("execution(* com.tang.service.*.*(..))")
    public void beforeAspect(){
        System.out.println("前置增强");
    }

    @Around("mytime()")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("time aspect start");

        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            System.out.println("arg is " + arg);
        }

        long startTime = System.currentTimeMillis();

        //执行目标方法
        Object object = pjp.proceed();

        long endTime = System.currentTimeMillis();
        System.out.println("time aspect consume " + (endTime - startTime) + " ms");

        System.out.println("time aspect end");

        return object;
    }

}
