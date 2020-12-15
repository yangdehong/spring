package com.ydh.redsheep.aop.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyHanlder implements MethodInterceptor {

    private Object obj;

    public CglibProxyHanlder(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("委托中介找房子");
//                        System.out.println("中介（代理）收取服务费3000元");
        Object invoke = method.invoke(obj, objects);
//                        System.out.println("客户信息卖了3毛钱");
        return invoke;
    }
}
