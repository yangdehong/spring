package com.ydh.redsheep.simple;

import com.ydh.redsheep.beanlife.Person;
import com.ydh.redsheep.beanlife.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSimple {

    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//        SpringDemo bean = ac.getBean(SpringDemo.class);


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());
        context.close();

    }

}
