package com.jwc.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 22:05
 * @Description: com.jwc.composite
 * @version: 1.0
 */
public class BranchNode extends Node{
    private String name;
    private List<Node> nodeList;

    public BranchNode() {
    }

    public BranchNode(String name) {
        this.name = name;
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    void print() {
        System.out.println(this.name);
    }

    BranchNode add(Node n){
        if(nodeList==null){
            nodeList = new ArrayList<Node>();
        }
        nodeList.add(n);
        return this;
    }
}
