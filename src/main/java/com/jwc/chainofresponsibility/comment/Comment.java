package com.jwc.chainofresponsibility.comment;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/12 - 12 - 12 - 12:51
 * @Description: com.jwc.chainofresponsibility
 * @version: 1.0
 */
public class Comment {
    private String comment;

    public Comment(){

    }

    public Comment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment='" + comment + '\'' +
                '}';
    }
}
