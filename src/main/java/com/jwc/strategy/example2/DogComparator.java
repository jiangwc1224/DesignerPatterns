package com.jwc.strategy.example2;

import java.util.Comparator;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:58
 * @Description: com.jwc.strategy.example2
 * @version: 1.0
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.getSpeed() < o2.getSpeed()){
            return -1;
        }else if(o1.getSpeed()>o2.getSpeed()){
            return 1;
        }else {
            return 0;
        }

    }
}
