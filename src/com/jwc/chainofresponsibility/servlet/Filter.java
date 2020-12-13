package com.jwc.chainofresponsibility.servlet;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 14:11
 * @Description: com.jwc.chainofresponsibility.servlet
 * @version: 1.0
 */
public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
