package com.jwc.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 *
 * 优点：不仅仅能代理一类对象
 * 局限：只能代理实现了接口的类
 *
 * 底层原理，运用了asm（可以操纵二进制码的.class文件）
 *
 *
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 17:18
 * @Description: com.jwc.proxy.dynamicproxy.jdk
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Calculator o = (Calculator)Proxy.newProxyInstance(myCalculator.getClass().getClassLoader(), myCalculator.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + "start");
                Object result = method.invoke(myCalculator, args);
                System.out.println(method.getName() + "end");
                return result;
            }
        });

        System.out.println(o.sub(5,2));

    }

}
