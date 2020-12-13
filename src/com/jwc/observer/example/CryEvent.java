package com.jwc.observer.example;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/13 - 12 - 13 - 19:43
 * @Description: com.jwc.observer.example
 * @version: 1.0
 */
public class CryEvent extends Event<Baby> {
    String location;
    int age;
    long timestamp;
    Baby source;

    public CryEvent(String location, int age, long timestamp,Baby baby) {
        this.location = location;
        this.age = age;
        this.timestamp = timestamp;
        this.source = baby;
        System.out.println(this.age + "岁的宝宝在" + this.location +"哭了" + this.timestamp +"ms的时间");
    }

    @Override
    Baby getSource() {
        return source;
    }
}
