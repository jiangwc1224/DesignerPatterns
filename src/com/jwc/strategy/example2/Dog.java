package com.jwc.strategy.example2;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 23:14
 * @Description: com.jwc.strategy.example2
 * @version: 1.0
 */
public class Dog {
    private int speed;

    public Dog(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                '}';
    }
}
