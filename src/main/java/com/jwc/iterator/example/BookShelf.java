package com.jwc.iterator.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiangwc
 * @Date: 2021/1/3 - 01 - 03 - 21:30
 * @Description: com.jwc.iterator.example
 * @version: 1.0
 */
public class BookShelf {
    List<Book> books = new ArrayList<Book>();

    public BookShelf() {
    }

    public void add(Book book){
        books.add(book);
    }

    public MyIterator Iterator(){
        return new BookShelfIterator();
    }

    class BookShelfIterator implements MyIterator{
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != books.size();
        }

        @Override
        public Object next() {
            Book bookNext = books.get(cursor);
            cursor++;
            return  bookNext;
        }
    }
}


