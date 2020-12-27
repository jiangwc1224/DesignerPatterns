package com.jwc.strategy.example2;

import java.util.Comparator;
import java.util.List;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/3 - 12 - 03 - 23:32
 * @Description: com.jwc.strategy.example2
 * @version: 1.0
 */
public class Action {
    public static <T> void sort(T[] arrays, Comparator<T> comparator){
        for (int i = 0; i <arrays.length-1 ; i++) {
            for (int j = i+1; j <arrays.length ; j++) {
                if(comparator.compare(arrays[i],arrays[j])>0){
                    T temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }
}
