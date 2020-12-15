package com.ydh.redsheep.factorybean;

import com.ydh.redsheep.pojo.TestFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
* FactoryBean主要适用于复杂bean的场景
* @author : yangdehong
* @date : 2020/12/15 18:29
*/
@Component
public class FactoryBeanDemo implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        // 这个Bean是我们自己new的，这里我们就可以控制Bean的创建过程了
        TestFactoryBean testBean = new TestFactoryBean();
        testBean.setId(1L);
        testBean.setName("测试FactoryBean功能");
        return testBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
