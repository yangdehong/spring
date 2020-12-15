package com.ydh.redsheep.aop.proxy;

import com.ydh.redsheep.aop.service.PersonService;

/**
* 静态代理代理类（对Person的，每真的一种代理就需要新增一个代理类，这个也就是代理类的问题）
* @author : yangdehong
* @date : 2020/12/15 14:19
*/
public class PersonProxy implements PersonService {

    private PersonService personService;

    public PersonProxy(PersonService personService) {
        this.personService = personService;
    }

    /**
     * 租房子
     */
    @Override
    public void renting(int money) {
        System.out.println("委托中介找房子");
        System.out.println("中介（代理）收取服务费3000元");
        personService.renting(money);
        System.out.println("客户信息卖了3毛钱");
    }
}
