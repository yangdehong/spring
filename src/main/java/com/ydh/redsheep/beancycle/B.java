package com.ydh.redsheep.beancycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope("prototype")
public class B {

    @Resource
    private C c;

    public B() {
    }

    public B(C c) {
        this.c = c;
    }
}
