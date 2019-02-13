package com.ydh.redsheep.aop.cglib;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public class CglibClazz {

    public void addUser(String username, String password) {
        //checkSecurity();
        System.out.println("-------------userManager.add()---------");
    }

    public void delUser(int userId) {
        //checkSecurity();
        System.out.println("-------------userManager.delUser()---------");
    }

    public String findUserById(int userId) {
        //checkSecurity();
        System.out.println("-------------userManager.findUserById()---------");
        return "张三";
    }

    public void modifyUser(int userId, String username, String passwordString) {
        //checkSecurity();
        System.out.println("-------------userManager.modifyUser()---------");
    }

}
