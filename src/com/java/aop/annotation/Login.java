package com.java.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面的意思
@Order(1)
public class Login {

    //切面
    @Before("execution(* com.java.aop.annotation.AppDaoImpl.*(..))")
    public void login(){
        System.out.println("Login...login()...前置通知");
    }
}
