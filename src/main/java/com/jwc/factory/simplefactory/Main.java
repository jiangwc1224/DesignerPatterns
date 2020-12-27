package com.jwc.factory.simplefactory;

/**
 * 简单工厂模式
 * 具体工厂：BMWFactory
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 0:34
 * @Description: com.jwc.factory.simplefactory
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BMW bmw = BMWFactory.create(BMWFactory.BMW_SC);
        bmw.type();
    }
}
