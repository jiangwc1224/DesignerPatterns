package com.jwc.flyweight;

import java.util.HashMap;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 23:11
 * @Description: com.jwc.flyweight
 * @version: 1.0
 */
public class NamePool {
    HashMap<String,Name> pool = new HashMap<String,Name>();

    public Name getName(String name){

        Name LastName = null;
        if(pool.containsKey(name)){
            LastName = pool.get(name);
            System.out.println("池中已经存在" + name +  "==直接取得==");
        }else{
            LastName =  new LastName(name);
            pool.put(name,LastName);
            System.out.println("池中不存在" + name +  "==创建并取得==");
        }
        return LastName;
    }
}
