package com.ydh.redsheep.aop.jdk;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/19.
 */
public class MyJdkProxyTestImpl implements MyJdkProxyTest {

    @Override
    public void addUser() {
        System.out.println("addUser");
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");
    }

}
