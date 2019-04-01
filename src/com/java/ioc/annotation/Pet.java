package com.java.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class Pet {

    public Pet(){
        System.out.println("Pet...宠物被创建了");
    }
}
