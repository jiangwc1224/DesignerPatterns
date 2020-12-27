package com.jwc.chainofresponsibility.servlet;

/**
 * 模拟javax.servlet的Filter,同时这也是struts2和MVC拦截器实现方式，
 *      Request和Response共用一个Filter,不过Request正向执行FilterChain中Filter,Request逆向执行FilterChain中Filter,
 *
 * 注意点
 *      1) Filter的doFilter方法 有三个参数Request ,Response ,FilterChain
 *      2) Filter不用实现Filter接口
 *      3）每调用一次FilterChain的doFilter方法 index索引才会向下一个Filter移动
 *
 *
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 14:18
 * @Description: com.jwc.chainofresponsibility.servlet
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();

        request.setReqStr("request: 我是要成为<海贼王>的打工人 jwc.com go!");
        response.setRespStr("response: 看看与request处理的filter是否相反呀");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new SensitiveFilter()).add(new UrlFilter());

        filterChain.doFilter(request,response);

        System.out.println(request.getReqStr());
        System.out.println(response.getRespStr());
    }
}
