package com.jwc.factory.abstractfactory;

import java.lang.invoke.VarHandle;

/**
 * 抽象工厂模式
 *
 * 应用场景：用于生产多个产品等级结构的产品
 *
 * 抽象工厂：SkinFactory
 * 具体工厂：ModernSkinFactory，StudentSkinFactory
 * 抽象类(产品一族)：HairStyle，SetStyle，ShoesStyle
 * 具体类：[BoomHair,JacketSet,MadingShoes],[WatermelonHair,UniformSet,SportShoes]
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 22:02
 * @Description: com.jwc.factory.abstractfactory
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ModernSkinFactory modernSkinFactory = new ModernSkinFactory();
        HairStyle hair = modernSkinFactory.createHair();
        SetStyle set = modernSkinFactory.createSet();
        ShoesStyle shoes = modernSkinFactory.createShoes();
        hair.showHair();
        set.showSet();
        shoes.showShoes();
    }
}
