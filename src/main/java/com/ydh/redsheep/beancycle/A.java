package com.ydh.redsheep.beancycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope("prototype")
public class A {

    @Resource
    private B b;

    public A() {
    }

    public A(B b) {
        this.b = b;
    }
}
