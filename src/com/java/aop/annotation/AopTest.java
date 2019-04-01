package com.java.aop.annotation;

import com.java.controller.GetBookServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class AopTest {

    @Test
    public void test1(){

        //开启spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppDaoImpl appDaoImpl = context.getBean("AppDaoImpl", AppDaoImpl.class);
        appDaoImpl.selectMoney();
        //关闭
        ((ClassPathXmlApplicationContext)context).close();

    }
}
