package com.ydh.redsheep.aop.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/19.
 */
public class MyCglibTestHandler implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("i am cglib");
        return methodProxy.invokeSuper(o,objects);
    }

    public Object getProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        //生成指定类对象的子类,也就是重写类中的业务函数，在重写中加入intercept()函数而已。
        enhancer.setSuperclass(clazz);
        //这里是回调函数，enhancer中肯定有个MethodInterceptor属性。
        //回调函数是在setSuperclass中的那些重写的方法中调用---猜想
        enhancer.setCallback(this);
        //创建这个子类对象
        return enhancer.create();
    }

}
