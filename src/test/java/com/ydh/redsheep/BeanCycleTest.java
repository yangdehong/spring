package com.ydh.redsheep;

import com.ydh.redsheep.beancycle.A;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanCycleTest {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        A a = (A) applicationContext.getBean("a");
        System.out.println(a);
    }

}
