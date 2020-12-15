package com.ydh.redsheep;

import com.ydh.redsheep.factorybean.FactoryBeanDemo;
import com.ydh.redsheep.pojo.TestFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryBeanTest {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        // 获取bean
        FactoryBeanDemo factoryBeanLearn = (FactoryBeanDemo) applicationContext.getBean("&factoryBeanDemo");
        System.out.println(factoryBeanLearn);
        // 获取FactoryBean
        TestFactoryBean testFactoryBean = (TestFactoryBean) applicationContext.getBean("factoryBeanDemo");
        System.out.println(testFactoryBean);
    }

}
