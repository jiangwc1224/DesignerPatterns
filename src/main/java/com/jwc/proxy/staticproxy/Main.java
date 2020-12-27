package com.jwc.proxy.staticproxy;

/**
 * 静态代理
 *
 * 优点：代理类里可以聚合接口对象，可以实现代理类包代理类，类似装饰者模式
 * 局限：只能代理一类事物(比如本例：只能代理实现了Calculator的类)
 *
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 17:05
 * @Description: com.jwc.proxy.staticproxy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {

        Calculator calculatorProxy = new CalculatorLogProxy(new CalculatorTransactionProxy(new MyCalculator()));

        System.out.println(calculatorProxy.add(3,4));
    }
}
