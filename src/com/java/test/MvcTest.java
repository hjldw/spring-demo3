package com.java.test;

import com.java.controller.GetBookServlet;
import com.java.ioc.annotation.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MvcTest {

    @Test
    public void test1(){
        //开启spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetBookServlet getBookServlet = context.getBean("getBookServlet", GetBookServlet.class);
        List<String> bookList = getBookServlet.doGet();
        System.out.println(bookList);
        //关闭
        ((ClassPathXmlApplicationContext)context).close();
    }
}
