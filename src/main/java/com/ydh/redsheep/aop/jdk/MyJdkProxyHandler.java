package com.ydh.redsheep.aop.jdk;

import com.ydh.redsheep.aop.service.AOPServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/19.
 */
public class MyJdkProxyHandler implements InvocationHandler {

    private Object target;

    public MyJdkProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }

    public static Object getProxy(Class clazz){
        return Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz}, new MyJdkProxyHandler(new AOPServiceImpl()));
    }

}
