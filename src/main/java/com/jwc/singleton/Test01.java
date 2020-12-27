package com.jwc.singleton;

/**
 * 饿汉单例模式
 * 最常用，private的构造方法， public的getInstance()方法
 * 缺点：未使用就实例化，占用内存（不值一提的缺点）
 *
 * @Auther: jiangwc
 * @Date: 2020/12/1 - 12 - 01 - 23:38
 * @Description: java.com.jwc.singleton
 * @version: 1.0
 */
public class Test01 {
    private static final Test01 INSTANCE = new Test01();

    private Test01() {
    }

    public static Test01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Test01 test01_1 = Test01.getInstance();
        Test01 test01_2 = Test01.getInstance();
        System.out.println(test01_1 == test01_2);
    }
}
