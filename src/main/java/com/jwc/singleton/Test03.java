package com.jwc.singleton;

/**
 * 懒汉单例模式
 * 为防止并发问题，加锁synchronized
 * 缺点：效率会变低
 *
 *  @Auther: jiangwc
 * @Date: 2020/12/2 - 12 - 02 - 23:57
 * @Description: com.jwc.singleton
 * @version: 1.0
 */
public class Test03 {
    private static Test03 INSTANCE =null;

    private Test03() {
    }

    public static synchronized Test03 getINSTANCE() {
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE =new Test03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() -> System.out.println(Test03.getINSTANCE().hashCode())).start();
        }
    }
}
