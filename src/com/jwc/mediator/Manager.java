package com.jwc.mediator;

/**
 * 具体的中介者类
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 23:42
 * @Description: com.jwc.mediator
 * @version: 1.0
 */
public class Manager implements Mediator {

    @Override
    public void change(String message, Member memberFrom, Member memberTo) {
        System.out.println("收到来自" + memberFrom.getName() + "的请求，内容为：" + message);
        System.out.println("马上把请求内容传达给" + memberTo.getName());
        memberTo.called(memberFrom);
    }
}
