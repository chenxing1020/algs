package com.cx.Tree;

/**
 * 线索二叉树
 * 应用场景：n个结点的二叉链表中有n-1个树枝，则必定有n+1个空链域，总和为2n，遍历效率较低
 */
public class ThreadedBinaryTree {
    ThreadedNode root;

    //全局变量用于临时存储前驱结点
    ThreadedNode pre = null;

    //设置根结点
    public void setRoot(ThreadedNode root) {
        this.root = root;
    }

    //获取根结点
    public ThreadedNode getRoot() {
        return root;
    }

    /**
     * 中序线索化
     */
    public void threadNodes() {
        threadNodes(root);
    }

    public void threadNodes(ThreadedNode node) {
        if (node == null) return;

        //递归左子树
        threadNodes(node.leftNode);

        //如果当前结点的左结点为空，pre为当前结点的前驱结点
        if (node.leftNode == null) {
            node.leftType = 1;
            node.leftNode = pre;
        }
        //如果pre的右结点为空，当前结点为pre的后继结点
        if (pre!=null && pre.rightNode == null) {
            pre.rightType = 1;
            pre.rightNode = node;

        }

        //每处理一个结点，当前结点是下一个结点的前驱结点
        pre = node;

        //递归右子树
        threadNodes(node.rightNode);
    }

    /**
     * 中序遍历线索二叉树（非递归）
     */
    public void midShow(){
        ThreadedNode node=root;
        while(node!=null){
            //循环找到中序遍历的第一个结点
            while (node.leftType==0){
                node=node.leftNode;
            }
            //输出当前结点
            System.out.println(node.value);
            //直接输出后继结点
            while(node.rightType==1){
                node=node.rightNode;
                System.out.println(node.value);
            }
            node=node.rightNode;
        }
    }



}
