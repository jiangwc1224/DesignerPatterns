package com.jwc.flyweight;

/**
 * 享元模式（共享元数据）
 * 适用于经常要new的小对象，避免无效的消耗内存空间
 *
 * 应用实例：String常量池，数据库连接池等
 *
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 23:25
 * @Description: com.jwc.flyweight
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        NamePool namePool = new NamePool();
        Name jiang = namePool.getName("江");
        jiang.print();
        Name xu = namePool.getName("徐");
        xu.print();

        FirstName weichen =new FirstName("伟晨");
        weichen.print();
    }
}
