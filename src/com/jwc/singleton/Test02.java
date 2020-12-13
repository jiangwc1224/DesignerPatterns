package com.jwc.singleton;

/**
 * 懒汉单例模式
 * 缺点：此方法存在并发问题
 *
 * @Auther: jiangwc
 * @Date: 2020/12/2 - 12 - 02 - 23:47
 * @Description: com.jwc.singleton
 * @version: 1.0
 */
public class Test02 {
    private static Test02 INSTANCE = null;

    private Test02() {
    }

    public static Test02 getINSTANCE() {
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Test02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() -> System.out.println(Test02.getINSTANCE().hashCode())).start();
        }
    }
}
