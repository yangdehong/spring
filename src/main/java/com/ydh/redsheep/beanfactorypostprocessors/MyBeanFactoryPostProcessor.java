package com.ydh.redsheep.beanfactorypostprocessors;

import com.ydh.redsheep.pojo.TestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("======================MyBeanFactoryPostProcessor==================");
        // 修改BeanDefinition
        BeanDefinition testBean = beanFactory.getBeanDefinition("testBean");
        MutablePropertyValues propertyValues = testBean.getPropertyValues();
        propertyValues.add("name","我是神");
        // 注册BeanDefinition
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(TestBean.class);
        genericBeanDefinition.getPropertyValues().add("name","我是好人");
        ((DefaultListableBeanFactory)beanFactory).registerBeanDefinition("BeanFactoryPostProcessorBeanTest",genericBeanDefinition);

    }
}
