package com.jwc.strategy.example1;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:41
 * @Description: com.jwc.strategy.example1
 * @version: 1.0
 */
public class Traveler {
    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelStyle(){
        travelStrategy.travelStyle();
    }
}
