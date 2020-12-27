package com.jwc.mediator;

/**
 * 抽象中介者类
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 23:32
 * @Description: com.jwc.mediator
 * @version: 1.0
 */
public interface Mediator {
    void change(String message,Member memberFrom,Member memberTo);
}
