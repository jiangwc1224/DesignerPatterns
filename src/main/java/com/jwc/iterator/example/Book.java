package com.jwc.iterator.example;

/**
 * @Auther: jiangwc
 * @Date: 2021/1/3 - 01 - 03 - 21:32
 * @Description: com.jwc.iterator.example
 * @version: 1.0
 */
public class Book {
    private String name ;
    private int pageCount;

    public Book() {
    }

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
