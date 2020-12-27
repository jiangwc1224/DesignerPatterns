package com.jwc.chainofresponsibility.comment;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 13:10
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class SensitiveFilter implements CommentFilter {

    @Override
    public boolean doFilter(Comment comment) {
        String str = comment.getComment();
        if(str.contains("海贼王")){
            return false;
        }
        return true;
//        str = str.replace("海贼王","火影");
//        comment.setComment(str);
    }
}
