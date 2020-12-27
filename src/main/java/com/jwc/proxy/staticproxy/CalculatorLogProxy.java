package com.jwc.proxy.staticproxy;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 16:55
 * @Description: com.jwc.proxy.staticproxy
 * @version: 1.0
 */
public class CalculatorLogProxy implements Calculator{
    private Calculator calculator;

    public CalculatorLogProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("add方法开始");
        int result = calculator.add(a,b);
        System.out.println("add方法结束");
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("sub方法开始");
        int result = calculator.sub(a,b);
        System.out.println("sub方法结束");
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("mul方法开始");
        int result = calculator.mul(a,b);
        System.out.println("mul方法结束");
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("div方法开始");
        int result = calculator.div(a,b);
        System.out.println("div方法结束");
        return result;

    }
}
