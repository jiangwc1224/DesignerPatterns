package com.jwc.iterator.example;

/**
 * 迭代器模式
 * 主要用于容器和容器遍历
 *
 * jdk自己本身的应用：List里面的Iterator()，都是实现了Iterator接口，用于遍历
 *
 * @Auther: jiangwc
 * @Date: 2021/1/3 - 01 - 03 - 22:38
 * @Description: com.jwc.iterator.example
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.add(new Book("三国演义",300));
        bookShelf.add(new Book("红楼梦",400));
        bookShelf.add(new Book("西游记",200));
        bookShelf.add(new Book("水浒传",100));

        MyIterator itr = bookShelf.Iterator();
        while (itr.hasNext()){
            Book book = (Book)itr.next();
            System.out.println(book);
        }
    }
}
