package com.jwc.flyweight;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 23:11
 * @Description: com.jwc.flyweight
 * @version: 1.0
 */
public class LastName extends Name {
    String xingStr;

    public LastName(String xingStr) {
        this.xingStr = xingStr;
    }

    @Override
    void print() {
        System.out.println("我是可共享的姓:" + this.xingStr);
    }
}
