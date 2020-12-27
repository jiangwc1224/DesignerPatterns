package com.jwc.proxy.dynamicproxy.cglib;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 16:50
 * @Description: com.jwc.proxy.dynamicproxy.cglib
 * @version: 1.0
 */
public class MyCalculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int mul(int a, int b) {
        return a*b;
    }

    public int div(int a, int b) {
        return a/b;
    }
}
