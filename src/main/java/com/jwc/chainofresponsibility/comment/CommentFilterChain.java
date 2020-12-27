package com.jwc.chainofresponsibility.comment;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 13:31
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class CommentFilterChain implements CommentFilter{
    private List<CommentFilter> commentFilters =null;

    public CommentFilterChain add(CommentFilter commentFilter){
        if(commentFilters == null){
            commentFilters = new ArrayList<CommentFilter>();
        }
        commentFilters.add(commentFilter);
        return this;
    }

    public CommentFilterChain remove(CommentFilter commentFilter){
        if(commentFilters !=null && commentFilters.size() >0){
            commentFilters.remove(commentFilter);
        }
        return this;
    }
    @Override
    public boolean doFilter(Comment comment) {
        for (CommentFilter cf : commentFilters) {
            if(!cf.doFilter(comment)){
                return false;
            }
        }
        return true;
    }
}
