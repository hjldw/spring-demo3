package com.java.ioc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAnnotationTest {

    @Test
    public void test1(){
        //开启spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = context.getBean("p", Person.class);
        System.out.println(p);
        //关闭
        ((ClassPathXmlApplicationContext)context).close();
    }
}
