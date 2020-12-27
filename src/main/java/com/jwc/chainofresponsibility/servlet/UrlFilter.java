package com.jwc.chainofresponsibility.servlet;

import com.jwc.chainofresponsibility.comment.Comment;
import com.jwc.chainofresponsibility.comment.CommentFilter;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 13:40
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class UrlFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        // 处理request
        String reqStr = request.getReqStr();
        reqStr = reqStr.replace("jwc.com","www.jwc.com");
        request.setReqStr(reqStr+"--UrlFilter");
        filterChain.doFilter(request,response);

        // 处理response
        String respStr = response.getRespStr();

        response.setRespStr(respStr+"--UrlFilter");
    }
}
