package com.jwc.chainofresponsibility.servlet;


/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 13:10
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class SensitiveFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        // 处理request
        String reqStr = request.getReqStr();
        reqStr = reqStr.replace("海贼王","火影");
        request.setReqStr(reqStr+"--SensitiveFilter");
        filterChain.doFilter(request,response);

        // 处理response
        String respStr = response.getRespStr();
        response.setRespStr(respStr+"--SensitiveFilter");
    }
}
