package com.ydh.redsheep.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 代理类-jdk的动态代理是针对接口的
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public class ProxyHandler implements InvocationHandler {

    private Object targetObject;

    public Object createProxyInstanceObject(Object targetobObject) {
        this.targetObject = targetobObject;

        return Proxy.newProxyInstance(targetobObject.getClass().getClassLoader(),
                targetobObject.getClass().getInterfaces(),
                this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checkSecurity();

        //调用目标方法
        Object ret = method.invoke(targetObject, args);

        return ret;
    }

    private void checkSecurity() {
        System.out.println("-----------checkSecurity----------");
    }

}