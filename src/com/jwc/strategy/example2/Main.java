package com.jwc.strategy.example2;

import java.util.Arrays;

/**
 * 策略模式
 * 策略接口类 ：java.util.Comparator<T>
 * 策略具体实现类 ：CatComparator，DogComparator
 * 环境类（策略使用者） ：Action
 *
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 23:54
 * @Description: com.jwc.strategy.example2
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Cat[] catArrays = {new Cat(20,20),new Cat(30,30),new Cat(10,10),new Cat(70,70),new Cat(50,50)};
        Action.sort(catArrays,new CatComparator());

        System.out.println(Arrays.toString(catArrays));
    }
}
