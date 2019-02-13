package com.ydh.redsheep.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
        System.out.println("i am jdk proxy");
        return method.invoke(target, args);
    }

}
