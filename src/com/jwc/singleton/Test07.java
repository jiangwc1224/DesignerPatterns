package com.jwc.singleton;

/**
 * 枚举单例（Java创始人之一写的方法）
 * 完美 ：不仅线程安全，还能防止反序列化（前面各种方法都能用过反射进行反序列化）
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 0:25
 * @Description: com.jwc.singleton
 * @version: 1.0
 */
public enum Test07 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(() -> System.out.println(Test07.INSTANCE.hashCode())).start();
        }
    }
}
