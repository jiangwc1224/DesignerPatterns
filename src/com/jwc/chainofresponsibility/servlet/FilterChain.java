package com.jwc.chainofresponsibility.servlet;



import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 14:36
 * @Description: com.jwc.chainofresponsibility.servlet
 * @version: 1.0
 */
public class FilterChain {
    List<Filter> filterList = null;
    int index = 0;

    public FilterChain add(Filter filter){
        if(filterList == null){
            filterList = new ArrayList<Filter>();
        }
        filterList.add(filter);
        return this;
    }

    public FilterChain remove(Filter filter){
        if(filterList !=null && filterList.size() >0){
            filterList.remove(filter);
        }
        return this;
    }

    public void doFilter(Request request, Response response) {
        if(filterList.size() == index){
            return;
        }

        Filter f = filterList.get(index);
        index++;

        f.doFilter(request, response, this);
    }

}
