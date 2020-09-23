package com.ydh.redsheep.beanlife;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());
        context.close();

    }

}
