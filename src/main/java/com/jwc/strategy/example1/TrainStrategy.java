package com.jwc.strategy.example1;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:38
 * @Description: com.jwc.strategy.example1
 * @version: 1.0
 */
public class TrainStrategy implements TravelStrategy {

    @Override
    public void travelStyle() {
        System.out.println("用火车出行。。。");
    }
}
