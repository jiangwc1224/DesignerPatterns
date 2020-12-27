package com.jwc.observer.example;

import java.util.Arrays;
import java.util.List;

/**
 * 观察者模式 （模型-视图模式 或 发布-订阅模式）-- 事件处理模型
 *  *
 * 被观察者(事件源对象)：宝宝
 * 观察者：妈妈，爸爸，狗
 * 观察事件：哭
 *
 * 优点：
 *      观察者模式在被观察者和观察者之间建立一个抽象的耦合。被观察者并不认识任何一个具体观察者，当发生变化时，只需要调用它们共有的接口方法就可以了。
 *
 * 缺点：
 *
 *      如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间
 *      如果在被观察者之间有循环依赖的话，被观察者会触发它们之间进行循环调用，导致系统崩溃。
 *      如果对观察者的通知是通过另外的线程进行异步投递的话，系统必须保证投递是以自恰的方式进行的
 *      虽然观察者模式可以随时使观察者知道所观察的对象发生了变化，但无法知道这个变化的过程
 *
 * 在阅读源码时候，observer,listener,hook,callback,其实都是运用了观察者模式，要注意！！！
 *
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 16:17
 * @Description: com.jwc.observer
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Baby baby = new Baby();
        List<Observer> observers = Arrays.asList(new Dad(), new Mom(), new Dog());

        baby.setLists(observers);
        baby.setAge(2);

        baby.cry("地上",120);
    }

}
