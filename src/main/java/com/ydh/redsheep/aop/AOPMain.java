package com.ydh.redsheep.aop;

import com.ydh.redsheep.aop.cglib.MyCglibTestHandler;
import com.ydh.redsheep.aop.jdk.MyJdkProxyHandler;
import com.ydh.redsheep.aop.service.AOPService;
import com.ydh.redsheep.aop.service.AOPServiceImpl;

/**
*
* @author : yangdehong
* @date : 2020-02-10 16:30
*/
public class AOPMain {


    public static void main(String[] args) {

        AOPService aopService = new AOPServiceImpl();

        long begin1 = System.currentTimeMillis();
        AOPService jdkAOP = (AOPService) MyJdkProxyHandler.getProxy(AOPService.class);
        long end1 = System.currentTimeMillis();
        System.out.println("jdk创建时间=" + (end1-begin1));

        long begin2 = System.currentTimeMillis();
        AOPServiceImpl cglibAOP = (AOPServiceImpl) MyCglibTestHandler.getProxy(AOPServiceImpl.class);
        long end2 = System.currentTimeMillis();
        System.out.println("cglib创建时间=" + (end2-begin2));

        for (int i = 0; i < 10; i++) {
            long begin = System.currentTimeMillis();
            run(aopService, 100000);
            long end = System.currentTimeMillis();
            System.out.println("不用代理时间=" + (end-begin));

            long begin3 = System.currentTimeMillis();
            run(jdkAOP, 100000);
            long end3 = System.currentTimeMillis();
            System.out.println("jdk代理时间=" + (end3-begin3));

            long begin4 = System.currentTimeMillis();
            run(cglibAOP, 100000);
            long end4 = System.currentTimeMillis();
            System.out.println("cglib代理时间=" + (end4-begin4));
        }

    }

    private static void run(AOPService aopService, int runCount) {
        for (int i = 0; i < runCount; i++) {
            aopService.addUser(i);
        }
    }

}
