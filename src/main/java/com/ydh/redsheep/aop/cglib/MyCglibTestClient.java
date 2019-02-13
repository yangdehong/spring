package com.ydh.redsheep.aop.cglib;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/19.
 */
public class MyCglibTestClient {

    public static void main(String[] args) {
        MyCglibTestHandler myCglibTestHandler = new MyCglibTestHandler();

        MyCglibTestImpl myCglibTest = (MyCglibTestImpl) myCglibTestHandler.getProxy(MyCglibTestImpl.class);

        myCglibTest.addUser();
    }

}
