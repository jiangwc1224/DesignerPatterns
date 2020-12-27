package com.jwc.chainofresponsibility.servlet;


/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 12:50
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request,Response response,FilterChain filterChain) {


        // 处理request
        String reqStr = request.getReqStr();
        reqStr = reqStr.replace("<","{").replace(">","}");
        request.setReqStr(reqStr+"--HtmlFilter");
        filterChain.doFilter(request,response);

        // 处理response
        String respStr = response.getRespStr();
        response.setRespStr(respStr+"--HtmlFilter");

    }
}
