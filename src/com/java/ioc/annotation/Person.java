package com.java.ioc.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "p")
//上面的注解等价于在applicationContext.xml文件中配置了一个bean标签，id属性=p 这个注解就是相当于写bean标签
//@Scope("singleton") 指定作用域： singleton,prototype,request,session
//@Lazy 指定懒加载

public class Person {

    //@Resource(name="chongWu")
    @Autowired
    private Pet pet;

        public Person(){
            System.out.println("Person...对象被创建了");
        }

        public void sleep(){
            System.out.println("Person....喜欢睡觉");
        }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                '}';
    }
}
