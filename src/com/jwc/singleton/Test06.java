package com.jwc.singleton;

/**
 * 静态内部类单例模式(利用了 JVM classloader 机制来保证初始化 INSTANCE 时只有一个线程.,加载类只加载一次)
 * 完美 加载外部类时候不会加载内部类，这样可以实现懒加载 只有通过显式调用 getInstance方法时，才会显式装载 内部类，从而实例化 INSTANCE
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 0:14
 * @Description: com.jwc.singleton
 * @version: 1.0
 */
public class Test06 {
    private Test06(){
    }

    private static class Test06Instance{
        private static final Test06 INSTANCE = new Test06();
    }

    public static Test06 getInstance(){
        return Test06Instance.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() -> System.out.println(Test06.getInstance().hashCode())).start();
        }
    }
}
