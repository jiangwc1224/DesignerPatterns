package com.jwc.chainofresponsibility.comment;


/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 12:49
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public interface  CommentFilter {
    boolean doFilter(Comment comment);
}
