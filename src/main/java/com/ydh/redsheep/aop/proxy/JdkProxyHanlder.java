package com.ydh.redsheep.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxyHanlder implements InvocationHandler {

    private Object obj;

    public JdkProxyHanlder(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("委托中介找房子");
//                        System.out.println("中介（代理）收取服务费3000元");
        Object invoke = method.invoke(obj, args);
//                        System.out.println("客户信息卖了3毛钱");
        return invoke;
    }

}
