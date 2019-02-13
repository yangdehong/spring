package com.ydh.redsheep.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public class CglibClient {

    public static void main(String[] args) {
        Enhancer en = new Enhancer();  //Enhancer用来生成一个原有类的子类
        en.setSuperclass(CglibClazz.class);
        en.setCallback(new CglibHandle());
        CglibClazz cglibClazz = (CglibClazz) en.create();
        cglibClazz.findUserById(1);
    }

}
