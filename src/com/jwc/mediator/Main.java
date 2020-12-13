package com.jwc.mediator;

/**
 * 调停者模式（中介者模式） ----- 行为性模式
 * 定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 *
 * 优点：
 *    降低了对象之间的耦合性，使得对象易于独立地被复用。
 *    将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。
 *
 *缺点：
 *    当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护。
 *
 *
 * 调停者模式与门面模式区别：
 * 1） 模式种类不同    调停者模式：行为性模式，  门面模式：结构模式
 * 2） 目的:门面模式是以封装和隔离为主要任务，而中介者模式则是以调和同事类之间的关系为主
 * 3) 功能区别:门面模式只是增加了一个门面， 它对子系统来说没有增加任何的功能， 子系统若脱离门面模式是完全可以独立运行的。
 *             而中介者模式则增加了业务功能，它把各个同事类中的原有耦合关系移植到了中介者，同事类不可能脱离中介者而独立存在，除非是想增加系统的复杂性和降低扩展性
 * 4) 知晓状态不同: 对门面模式来说，子系统不知道有门面存在，而对中介者来说，每个同事类都知道中介者存在，因为要依靠中介者调和同事之间的关系，它们对中介者非常了解。
 * 5) 封装程度不同:门面模式是一种简单的封装，所有的请求处理都委托给子系统完成，而中介者模式则需要有一个中心，由中心协调同事类完成，并且中心本身也完成部分业务，它属于更进一步的业务功能封装。
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 23:48
 * @Description: com.jwc.mediator
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MemberA memberA = new MemberA(manager, "成员A");
        MemberB memberB = new MemberB(manager, "成员B");
        MemberC memberC = new MemberC(manager, "成员C");
        memberA.setMessage("设计书第300行不理解，请解释");
        memberC.setMessage("电脑蓝屏了");
        memberA.call(memberB);
        System.out.println("----------------");
        memberC.call(memberB);
    }
}
