package com.ydh.redsheep.aop.jdk;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public interface ProxyInteface {

    void addUser(String username, String password);

    void delUser(int userId);

    String findUserById(int userId);

    void modifyUser(int userId, String username, String passwordString);

}
