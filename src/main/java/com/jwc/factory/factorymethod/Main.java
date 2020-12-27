package com.jwc.factory.factorymethod;

/**
 * 工厂方法模式
 * 优点：主要是提供了专门的工厂方法用来创建客户所需要的产品,同时还向客户隐藏了哪种具体产品类将被实例化这一细节;
 *      它能够让工厂自主确定创建何种产品对象,而如何创建这个对象的细节完全封装在具体工厂内部;
 *      在系统中加入新产品时完全符合开闭原则
 * 缺点：主要是系统中类的个数将成对增加,在一定程度上增加了系统的复杂度,会给系统带来一些额外的开销;
 *      增加了系统的抽象性和理解难度
 *
 * 应用场景：用于只生产一个产品等级结构的产品
 *
 * 抽象工厂：LogFactory
 * 具体工厂：FileLogFactory，DBLogFactory
 * 抽象类：Log
 * 具体类：FileLog，DBLog
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:22
 * @Description: com.jwc.factory.factorymethod
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        FileLogFactory fileLogFactory = new FileLogFactory();
        Log log = fileLogFactory.create();
        log.write();
    }
}
