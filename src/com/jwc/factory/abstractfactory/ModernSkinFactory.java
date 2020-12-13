package com.jwc.factory.abstractfactory;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:43
 * @Description: com.jwc.factory.abstractfactory
 * @version: 1.0
 */
public class ModernSkinFactory extends SkinFactory {
    @Override
    HairStyle createHair() {
        return new BoomHair();
    }

    @Override
    SetStyle createSet() {
        return new JacketSet();
    }

    @Override
    ShoesStyle createShoes() {
        return new MadingShoes();
    }
}
