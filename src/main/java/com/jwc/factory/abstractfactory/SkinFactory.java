package com.jwc.factory.abstractfactory;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:37
 * @Description: com.jwc.factory.abstractfactory
 * @version: 1.0
 */
public abstract class SkinFactory {
    abstract HairStyle createHair();
    abstract SetStyle createSet();
    abstract ShoesStyle createShoes();
}
