package com.ydh.redsheep;

import com.ydh.redsheep.aop.factory.ProxyFactory;
import com.ydh.redsheep.aop.proxy.PersonProxy;
import com.ydh.redsheep.aop.service.PersonService;
import com.ydh.redsheep.aop.service.PersonServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTests {

    /**
     * 静态代理
     */
    @Test
    public void staticProxy() {
        PersonService personService = new PersonServiceImpl();
        PersonProxy proxy = new PersonProxy(personService);
        proxy.renting(88);
    }

    /**
     * JDK动态代理
     */
    @Test
    public void jdkProxy() {
        PersonService personService = new PersonServiceImpl();
        PersonService jdkProxy = (PersonService) ProxyFactory.getInstance().getJdkProxy(personService);
        jdkProxy.renting(100);
    }

    /**
     * cglib动态代理
     */
    @Test
    public void cglibProxy() {
        PersonServiceImpl personService = new PersonServiceImpl();
        PersonServiceImpl cglibProxy = (PersonServiceImpl) ProxyFactory.getInstance().getCglibProxy(personService);
        cglibProxy.renting(200);
    }

    /**
     * 效率比较，使用前先把ProxyFactory和impl的sout输出注释
     */
    @Test
    public void testEfficiency() {
        PersonService personService = new PersonServiceImpl();

        long begin1 = System.currentTimeMillis();
        PersonService jdkAOP = (PersonService) ProxyFactory.getInstance().getJdkProxy(personService);
        long end1 = System.currentTimeMillis();
        System.out.println("jdk创建时间=" + (end1-begin1));
        long begin2 = System.currentTimeMillis();
        PersonServiceImpl cglibAOP = (PersonServiceImpl) ProxyFactory.getInstance().getCglibProxy(personService);
        long end2 = System.currentTimeMillis();
        System.out.println("cglib创建时间=" + (end2-begin2));

        for (int i = 0; i < 100; i++) {
            System.out.println("================================第" + i + "次进行处理==========================");
            long begin = System.currentTimeMillis();
            run(personService, 1000000);
            long end = System.currentTimeMillis();
            System.out.println("不用代理时间=" + (end-begin));
            long begin3 = System.currentTimeMillis();
            run(jdkAOP, 1000000);
            long end3 = System.currentTimeMillis();
            System.out.println("jdk代理时间=" + (end3-begin3));
            long begin4 = System.currentTimeMillis();
            run(cglibAOP, 1000000);
            long end4 = System.currentTimeMillis();
            System.out.println("cglib代理时间=" + (end4-begin4));
        }
    }

    private static void run(PersonService personService, int runCount) {
        for (int i = 0; i < runCount; i++) {
            personService.renting(3000);
        }
    }

}

