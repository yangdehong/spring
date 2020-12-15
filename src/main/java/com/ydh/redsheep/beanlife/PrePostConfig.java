package com.ydh.redsheep.beanlife;

import com.ydh.redsheep.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ydh.redsheep.beanlife")
public class PrePostConfig {
    @Bean
    Person person(){
        Person person = new Person();
        person.setName("YDH");
        return person;
    }
}
