package com.jwc.composite;

/**
 * 组合模式
 * 适用于树状结构的情景
 *
 * @Auther: jiangwc
 * @Date: 2020/12/16 - 12 - 16 - 22:17
 * @Description: com.jwc.composite
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("书");
        BranchNode dict11 = new BranchNode("玄幻");
        BranchNode dict12 = new BranchNode("漫画");
        BranchNode dict13 = new BranchNode("悬疑");
        Node leaf111 = new LeafNode("斗罗大陆");
        Node leaf112 = new LeafNode("斗破苍穹");
        Node leaf113 = new LeafNode("阴阳师");
        Node leaf121 = new LeafNode("火影忍者");
        Node leaf122 = new LeafNode("海贼王");
        Node leaf131 = new LeafNode("白夜行");

        root.add(dict11).add(dict12).add(dict13);
        dict11.add(leaf111).add(leaf112).add(leaf113);
        dict12.add(leaf121).add(leaf122);
        dict13.add(leaf131);
        getCompositeName(root,0);

    }

    private static void getCompositeName(Node node,int level){

        for (int i = 0; i <level ; i++) {
            System.out.print("--");
        }
        node.print();

        if(node instanceof BranchNode){
            for (Node n :((BranchNode) node).getNodeList()) {
                getCompositeName(n,level+1);
            }
        }
    }
}
