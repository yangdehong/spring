package com.ydh.redsheep.beancycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Scope("prototype")
public class C {

    @Resource
    private A a;

    public C() {
    }

    public C(A a) {
        this.a = a;
    }
}
