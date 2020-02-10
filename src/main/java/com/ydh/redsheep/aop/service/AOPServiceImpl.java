package com.ydh.redsheep.aop.service;

public class AOPServiceImpl implements AOPService {

    @Override
    public int addUser(int i) {
       return i+1;
    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");
    }

}
