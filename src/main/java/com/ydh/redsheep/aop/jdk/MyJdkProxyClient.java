package com.ydh.redsheep.aop.jdk;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/19.
 */
public class MyJdkProxyClient {

    public static void main(String[] args) {
        MyJdkProxyTest myJdkProxyTest = (MyJdkProxyTest) Proxy.newProxyInstance(MyJdkProxyTest.class.getClassLoader(), new Class[]{MyJdkProxyTest.class},
                new MyJdkProxyHandler(new MyJdkProxyTestImpl()));
        myJdkProxyTest.addUser();
    }

}
