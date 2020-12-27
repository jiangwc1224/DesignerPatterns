package com.jwc.strategy.example2;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 23:08
 * @Description: com.jwc.strategy.example2
 * @version: 1.0
 */
public class Cat {
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
