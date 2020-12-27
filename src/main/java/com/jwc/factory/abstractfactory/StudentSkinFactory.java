package com.jwc.factory.abstractfactory;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:46
 * @Description: com.jwc.factory.abstractfactory
 * @version: 1.0
 */
public class StudentSkinFactory extends SkinFactory {
    @Override
    HairStyle createHair() {
        return new WatermelonHair();
    }

    @Override
    SetStyle createSet() {
        return new UniformSet();
    }

    @Override
    ShoesStyle createShoes() {
        return new SportShoes();
    }
}
