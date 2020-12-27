package com.jwc.flyweight;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 23:11
 * @Description: com.jwc.flyweight
 * @version: 1.0
 */
public class FirstName extends Name {
    private String mingName;

    public FirstName(String mingName) {
        this.mingName = mingName;
    }


    @Override
    void print() {
        System.out.println("我是不可共享的名:" + this.mingName);
    }
}
