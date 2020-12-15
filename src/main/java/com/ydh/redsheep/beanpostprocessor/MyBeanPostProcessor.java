package com.ydh.redsheep.beanpostprocessor;

import com.ydh.redsheep.pojo.TestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor#postProcessBeforeInitialization");
        if (bean instanceof TestBean) {
            System.out.println(beanName);
            ((TestBean) bean).setId(1L);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor#postProcessAfterInitialization");
        if (bean instanceof TestBean) {
            System.out.println(beanName);
            ((TestBean) bean).setId(2L);
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
