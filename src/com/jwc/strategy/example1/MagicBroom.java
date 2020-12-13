package com.jwc.strategy.example1;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:41
 * @Description: com.jwc.strategy.example1
 * @version: 1.0
 */
public class MagicBroom implements TravelStrategy {
    @Override
    public void travelStyle() {
        System.out.println("用魔法扫帚出行。。。");
    }
}
