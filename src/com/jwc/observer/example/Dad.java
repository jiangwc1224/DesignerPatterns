package com.jwc.observer.example;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/13 - 12 - 13 - 19:33
 * @Description: com.jwc.observer.example
 * @version: 1.0
 */
public class Dad implements Observer{
    @Override
    public void actionForCry(Event event) {
        System.out.println("爸爸--做鬼脸");
    }

}
