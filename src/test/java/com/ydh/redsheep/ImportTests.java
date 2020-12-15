package com.ydh.redsheep;

import com.ydh.redsheep.importbean.ImportDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImportTests {

    @Test
    public void test() {
        // 这里的参数代表要做操作的类
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ImportDemo.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        // 打印出来注入的类
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }


}

