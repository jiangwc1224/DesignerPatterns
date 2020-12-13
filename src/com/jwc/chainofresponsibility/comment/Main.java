package com.jwc.chainofresponsibility.comment;

/**
 * 责任链模式
 *
 * 优点：
 *      实现了请求发送者与请求处理者之间的松耦合
 *      可动态添加责任对象、删除责任对象、改变责任对象顺序，非常灵活
 *      每个责任对象专注于做自己的事情，职责明确
 *
 * 要实现动态终止某过滤操作，可以给doFilter()加boolean类型返回值来控制
 *
 * 编程小技巧：给CommentFilterChain类中add和remove方法的返回值类型设为自身，就可以链式编程  .add().add()
 *
 *
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 13:11
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment("我是要成为<海贼王>的打工人 jwc.com go!");
        HtmlFilter htmlFilter = new HtmlFilter();
        SensitiveFilter sensitiveFilter = new SensitiveFilter();
        UrlFilter urlFilter = new UrlFilter();
//        htmlFilter.doFilter(comment);
//        sensitiveFilter.doFilter(comment);

        CommentFilterChain commentFilterChain = new CommentFilterChain();
        commentFilterChain.add(htmlFilter).add(sensitiveFilter);
        CommentFilterChain commentFilterChain2 = new CommentFilterChain();
        commentFilterChain2.add(urlFilter);

        // 因为我的CommentFilterChain也实现了CommentFilter接口，也相当于是个CommentFilter，所以可以两个CommentFilterChain相加
        commentFilterChain.add(commentFilterChain2);

        commentFilterChain.doFilter(comment);

        System.out.println(comment);
    }


}
