package com.jwc.flyweight;

/**
 * String常量池应用享元模式的验证
 *
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 23:33
 * @Description: com.jwc.flyweight
 * @version: 1.0
 */
public class StringMain {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str3 == str4); // false
        System.out.println(str3.intern() == str1);// true
        System.out.println(str3.intern() == str4.intern());// true
    }
}
