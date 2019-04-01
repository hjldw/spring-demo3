package com.java.aop.annotation;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面的意思
@Order(2)
public class Security {

    //切面
    @Before("execution(* com.java.aop.annotation.AppDaoImpl.*(..))")
     public void isSecurity(){
         System.out.println("Security...isSecurity()......前置通知");
     }
}
