package com.jwc.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/13 - 12 - 13 - 19:31
 * @Description: com.jwc.observer.example
 * @version: 1.0
 */
public class Baby {
    private int age;
    private List<Observer> lists = new ArrayList<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Observer> getLists() {
        return lists;
    }

    public void setLists(List<Observer> lists) {
        this.lists = lists;
    }

    public void cry(String loc, long timestamp){

        CryEvent cry = new CryEvent(loc, age, timestamp,this);

        for (Observer observer : lists) {
            observer.actionForCry(cry);
        }
    }
}
