package com.jwc.factory.factorymethod;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:18
 * @Description: com.jwc.factory.factorymethod
 * @version: 1.0
 */
public class DBLogFactory extends LogFactory{
    @Override
    Log create() {
        return new DBLog();
    }
}
