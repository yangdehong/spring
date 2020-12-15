package com.ydh.redsheep.listeners;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author annpeter.it@gmail.com
 * @date 17/09/2018
 */
@Component
public class StartFailedListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        Throwable ex = event.getException();
        System.err.println("============================= start failed !=============================\n" + ex);
    }
}