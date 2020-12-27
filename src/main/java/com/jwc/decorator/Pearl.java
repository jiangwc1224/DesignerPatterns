package com.jwc.decorator;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/5 - 12 - 05 - 21:46
 * @Description: com.jwc.decorator
 * @version: 1.0
 */
public class Pearl extends DrinkDecorator {

    public Pearl(Drink drink) {
        super(drink);
    }

    private int price(){
        System.out.println("加珍珠：2元");
        return 2;
    }

    @Override
    int sale() {
        int drinkPrice = super.sale();
//        this.priceTotal = super.getDrink().priceTotal + 2;
//        System.out.println("priceTotal:" +this.priceTotal);
        return drinkPrice+this.price();
    }
}
