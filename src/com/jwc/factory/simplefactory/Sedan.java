package com.jwc.factory.simplefactory;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 0:16
 * @Description: com.jwc.factory.simplefactory
 * @version: 1.0
 */
public class Sedan extends BMW {

    @Override
    public void type() {
        System.out.println("宝马一系，宝马3系，宝马5系......");
    }
}
