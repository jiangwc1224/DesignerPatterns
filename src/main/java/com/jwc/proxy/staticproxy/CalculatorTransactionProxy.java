package com.jwc.proxy.staticproxy;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 17:10
 * @Description: com.jwc.proxy.staticproxy
 * @version: 1.0
 */
public class CalculatorTransactionProxy implements Calculator {
    private Calculator calculator;

    public CalculatorTransactionProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Transaction开始---用log代表加了事务管理");
        int result = calculator.add(a,b);
        System.out.println("Transaction结束");
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("Transaction开始---用log代表加了事务管理");
        int result = calculator.sub(a,b);
        System.out.println("Transaction结束");
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("Transaction开始---用log代表加了事务管理");
        int result = calculator.mul(a,b);
        System.out.println("Transaction结束");
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("Transaction开始---用log代表加了事务管理");
        int result = calculator.div(a,b);
        System.out.println("Transaction结束");
        return result;
    }
}
