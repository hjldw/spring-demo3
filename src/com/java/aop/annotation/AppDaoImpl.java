package com.java.aop.annotation;

import org.springframework.stereotype.Component;

@Component("AppDaoImpl")
public class AppDaoImpl {

    //核心类
    public void selectMoney(){
        System.out.println("AppDaoImpl...你的账户余额是：10W");
    }

    public void zhuangMoney(){
        System.out.println("AppDaoImpl...转账：10W");
    }
}
