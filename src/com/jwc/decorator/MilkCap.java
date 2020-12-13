package com.jwc.decorator;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/5 - 12 - 05 - 21:51
 * @Description: com.jwc.decorator
 * @version: 1.0
 */
public class MilkCap extends DrinkDecorator {
    public MilkCap(Drink drink) {
        super(drink);
    }

    private int price(){
        System.out.println("加奶盖：3元");
        return 3;
    }

    @Override
    int sale(){
        int drinkPrice = super.sale();
//        this.priceTotal = super.getDrink().priceTotal + 3;
//        System.out.println("priceTotal:" +this.priceTotal);
        return drinkPrice+this.price();
    }
}
