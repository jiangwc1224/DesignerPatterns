package com.jwc.proxy.dynamicproxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 动态代理
 *
 * 优点：即便没有实现接口的类也能被代理
 * 局限： final修饰的类不能被代理 ---（但是直接用asm操纵可以代理final类）
 *
 *  底层用的也是asm
 *
 * @Auther: jiangwc
 * @Date: 2020/12/27 - 12 - 27 - 17:32
 * @Description: com.jwc.proxy.dynamicproxy.cglib
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyCalculator.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println(obj.getClass().getSuperclass().getName());
                System.out.println(method.getName() + "start");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println(method.getName() + "end");

                return result;
            }
        });
        MyCalculator o = (MyCalculator) enhancer.create();
        System.out.println(o.mul(3,4));
    }
}
