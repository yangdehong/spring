package com.ydh.redsheep.aop.jdk;

/**
 * @description:
 * @author: yangdehong
 * @version: 2018/1/18.
 */
public class ProxyClient {

    public static void main(String[] args) {
        ProxyHandler handler = new ProxyHandler();

        ProxyInteface proxyInteface = (ProxyInteface)handler.createProxyInstanceObject(new ProxyClazz());

        proxyInteface.addUser("zhangsan", "123");
    }

}
