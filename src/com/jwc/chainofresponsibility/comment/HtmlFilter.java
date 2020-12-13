package com.jwc.chainofresponsibility.comment;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 12:50
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class HtmlFilter implements CommentFilter {
    @Override
    public boolean doFilter(Comment comment) {
        String str = comment.getComment();
        str = str.replace("<","{");
        str = str.replace(">","}");
        comment.setComment(str);
        return true;

    }
}
