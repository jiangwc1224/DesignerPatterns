package com.jwc.chainofresponsibility.comment;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 13:40
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class UrlFilter implements CommentFilter {
    @Override
    public boolean doFilter(Comment comment) {
        String str = comment.getComment();
        str = str.replace("jwc.com","www.jwc.com");
        comment.setComment(str);
        return true;
    }
}
