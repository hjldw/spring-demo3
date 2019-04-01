package com.java.aop.annotation;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面的意思
public class Logger {

    //切面
    @After("execution(* com.java.aop.annotation.AppDaoImpl.*(..))")
    public void log(){
        System.out.println("Logger...log()....后置通知记录日志");
    }
}
