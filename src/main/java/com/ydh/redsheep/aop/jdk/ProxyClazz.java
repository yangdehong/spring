package com.ydh.redsheep.aop.jdk;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public class ProxyClazz implements ProxyInteface {

    @Override
    public void addUser(String username, String password) {
        //checkSecurity();
        System.out.println("-------------userManager.add()---------");
    }

    @Override
    public void delUser(int userId) {
        //checkSecurity();
        System.out.println("-------------userManager.delUser()---------");
    }

    @Override
    public String findUserById(int userId) {
        //checkSecurity();
        System.out.println("-------------userManager.findUserById()---------");
        return "张三";
    }

    @Override
    public void modifyUser(int userId, String username, String passwordString) {
        //checkSecurity();
        System.out.println("-------------userManager.modifyUser()---------");
    }

}
