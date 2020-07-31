package com.ydh.redsheep.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimple {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        SpringDemo bean = ac.getBean(SpringDemo.class);
    }

}
