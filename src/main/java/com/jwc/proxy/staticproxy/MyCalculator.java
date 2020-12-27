package com.jwc.proxy.staticproxy;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 16:50
 * @Description: com.jwc.proxy.staticproxy
 * @version: 1.0
 */
public class MyCalculator implements Calculator{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
