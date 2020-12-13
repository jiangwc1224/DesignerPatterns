package com.jwc.strategy.example2;

import java.util.Comparator;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 22:58
 * @Description: com.jwc.strategy.example2
 * @version: 1.0
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getWeight() < o2.getWeight()){
            return -1;
        }else if(o1.getWeight()>o2.getWeight()){
            return 1;
        }else {
            return 0;
        }

    }
}
