package com.jwc.factory.factorymethod;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/4 - 12 - 04 - 21:16
 * @Description: com.jwc.factory.factorymethod
 * @version: 1.0
 */
public class FileLogFactory extends LogFactory{
    @Override
    Log create() {
        return new FileLog();
    }
}
