package com.jwc.composite;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 22:05
 * @Description: com.jwc.composite
 * @version: 1.0
 */
public class LeafNode extends Node{
    private String name;

    public LeafNode() {
    }

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    void print() {
        System.out.println(this.name);
    }
}
