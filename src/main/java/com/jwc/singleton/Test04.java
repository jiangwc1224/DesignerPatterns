package com.jwc.singleton;

/**
 * 懒汉单例模式
 * 不锁整个方法，锁代码块
 * 缺点：并发存在问题
 *
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 0:02
 * @Description: com.jwc.singleton
 * @version: 1.0
 */
public class Test04 {
    private static Test04 INSTANCE= null;

    private Test04() {
    }

    public static Test04 getINSTANCE() {
        if(INSTANCE == null){
            synchronized(Test04.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Test04();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() -> System.out.println(Test04.getINSTANCE().hashCode())).start();
        }
    }
}
