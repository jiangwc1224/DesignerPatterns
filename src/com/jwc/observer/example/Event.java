package com.jwc.observer.example;

/**
 * 事件接口类
 * @Auther: jiangwc
 * @Date: 2020/12/13 - 12 - 13 - 19:43
 * @Description: com.jwc.observer.example
 * @version: 1.0
 */
public abstract class Event<T> {
    abstract T getSource();
}
