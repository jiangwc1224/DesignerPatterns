package com.jwc.strategy.example1;

/**
 * 策略模式
 * 策略接口类 ：TravelStrategy
 * 策略具体实现类 ：TrainStrategy，PlaneStrategy，MagicBroomStrategy
 * 环境类（策略使用者） ：Traveler
 *
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:44
 * @Description: com.jwc.strategy.example1
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setTravelStrategy(new MagicBroom());
        traveler.travelStyle();
    }
}
