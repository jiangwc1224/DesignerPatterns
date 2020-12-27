package com.jwc.decorator;

/**
 * 装饰模式
 *
 * 优点：
 *      装饰类和被装饰类可以独立发展，而不会相互耦合。它有效地把类的核心职责和装饰功能分开了
 *      装饰模式是继承关系的一个替代方案
 *      装饰模式可以动态地扩展一个实现类的功能
 * 缺点：
 *      多层装饰比较复杂。比如我们现在有很多层装饰，出了问题，一层一层检查，工作量大
 * 应用场景：
 *      需要扩展一个类的功能时
 *      需要动态地给一个对象增加功能，并可以动态地撤销时
 *      需要为一批的兄弟类进行改装或加装功能时
 * 该例: 饮料中加不同的添加物，并计算总价
 *
 * @Auther: jiangwc
 * @Date: 2020/12/5 - 12 - 05 - 21:56
 * @Description: com.jwc.decorator
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Drink tea = new Tea();
        System.out.println("共计： " + tea.sale());
        System.out.println("----------");
        tea = new Pearl(tea);
        System.out.println("共计： " + tea.sale());
        System.out.println("----------");
        tea = new MilkCap(tea);
        System.out.println("共计： " + tea.sale());

//        System.out.println("共计2： "+tea.priceTotal);
    }
}
