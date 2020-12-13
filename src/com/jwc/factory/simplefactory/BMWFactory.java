package com.jwc.factory.simplefactory;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 0:27
 * @Description: com.jwc.factory.simplefactory
 * @version: 1.0
 */
public class BMWFactory {
    public static final String BMW_SEDAN = "Sedan";
    public static final String BMW_SUV = "SUV";
    public static final String BMW_SC = "SportsCar";

    public static BMW create(String type){
        if(BMW_SEDAN.equals(type)){
            return new Sedan();
        }else if(BMW_SUV.equals(type)){
            return new SUV();
        }else if(BMW_SC.equals(type)){
            return new SportsCar();
        }else{
            return null;
        }
    }
}
