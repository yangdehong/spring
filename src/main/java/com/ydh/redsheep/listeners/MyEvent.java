package com.ydh.redsheep.listeners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source){
        super(source);
    }

    public final ApplicationContext getMyEventSource() {
        return (ApplicationContext) getSource();
    }

}
