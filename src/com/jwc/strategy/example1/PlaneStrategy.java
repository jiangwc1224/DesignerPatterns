package com.jwc.strategy.example1;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:39
 * @Description: com.jwc.strategy.example1
 * @version: 1.0
 */
public class PlaneStrategy implements TravelStrategy {
    @Override
    public void travelStyle() {
        System.out.println("用飞机出行。。。");
    }
}
