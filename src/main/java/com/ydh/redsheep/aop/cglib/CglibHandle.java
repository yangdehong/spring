package com.ydh.redsheep.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public class CglibHandle implements MethodInterceptor {

    //用来增强原有方法
    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2,
                            MethodProxy arg3) throws Throwable {
        System.out.println("======cglib======");
        return arg3.invokeSuper(arg0, arg2);
    }

}
