package com.jwc.mediator;

/**
 * 抽象同事类
 *
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 23:34
 * @Description: com.jwc.mediator
 * @version: 1.0
 */
public abstract class Member {
    private  Mediator mediator;

    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //初始化变量
    public Member(Mediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
    }

    public void call(Member member){
        System.out.println(name + "遇到问题了，希望经理帮我喊" + member.getName() + "提供帮助");
        mediator.change(message,this,member);
    }

    public void called(Member member){
        System.out.println(name + "已经通过经理收到来自" + member.getName() + "的帮助请求");
    }
}
