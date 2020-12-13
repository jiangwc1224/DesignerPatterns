package com.jwc.singleton;

/**
 * 懒汉单例模式（DCL）
 * 完美 效率不低，用到时候才实例化，不浪费内存空间
 * 缺点：写法较为复杂
 * 注意点：INSTANCE 要用volatile修饰，原因：防止指令重排(会加内存屏障)
 *
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 0:07
 * @Description: com.jwc.singleton
 * @version: 1.0
 */
public class Test05 {
    private static volatile Test05 INSTANCE =null;

    private Test05() {
    }

    public static Test05 getINSTANCE() {
        if(INSTANCE==null){
            synchronized (Test05.class){
                if(INSTANCE == null){
                    INSTANCE = new Test05();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() -> System.out.println(Test05.getINSTANCE().hashCode())).start();
        }
    }
}
