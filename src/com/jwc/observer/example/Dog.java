package com.jwc.observer.example;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/13 - 12 - 13 - 19:35
 * @Description: com.jwc.observer.example
 * @version: 1.0
 */
public class Dog implements Observer {
    @Override
    public void actionForCry(Event event) {
        System.out.println("狗--wwwwww");
    }
}
