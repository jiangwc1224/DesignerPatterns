package com.jwc.decorator;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/5 - 12 - 05 - 21:43
 * @Description: com.jwc.decorator
 * @version: 1.0
 */
public class Tea extends Drink{
    @Override
    int sale() {
        System.out.println("茶10元");
//        this.priceTotal = 10;
//        System.out.println("priceTotal:" +this.priceTotal);
        return 10;
    }
}
