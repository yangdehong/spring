package com.ydh.redsheep.importtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
*
* @author : yangdehong
* @date : 2020-07-31 14:00
*/
public class ImportTest {

    public static void main(String[] args) {
        // 这里的参数代表要做操作的类
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ImportDemo.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        // 打印出来注入的类
        for (String name : beanDefinitionNames){
            System.out.println(name);
        }
    }

}
