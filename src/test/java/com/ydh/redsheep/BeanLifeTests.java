package com.ydh.redsheep;

import com.ydh.redsheep.pojo.Person;
import com.ydh.redsheep.beanlife.PrePostConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanLifeTests {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());
        context.close();
    }


}

