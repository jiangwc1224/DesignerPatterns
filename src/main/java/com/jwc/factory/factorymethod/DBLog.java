package com.jwc.factory.factorymethod;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:20
 * @Description: com.jwc.factory.factorymethod
 * @version: 1.0
 */
public class DBLog extends Log {
    @Override
    void write() {
        System.out.println("用DB写日志");
    }
}
