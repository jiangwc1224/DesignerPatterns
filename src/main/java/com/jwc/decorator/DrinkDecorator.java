package com.jwc.decorator;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/5 - 12 - 05 - 21:45
 * @Description: com.jwc.decorator
 * @version: 1.0
 */
public abstract class DrinkDecorator extends Drink {
    private Drink drink;

//    public Drink getDrink() {
//        return drink;
//    }
//
//    public void setDrink(Drink drink) {
//        this.drink = drink;
//    }

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    int sale(){
        if(this.drink!=null){
            return this.drink.sale();
        }
        return 0;
    }


}
