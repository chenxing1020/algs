package com.cx.Tree;

/**
 * 线索二叉树结点类
 */
public class ThreadedNode {

    //结点的权值
    int value;
    //左儿子
    ThreadedNode leftNode;
    //右儿子
    ThreadedNode rightNode;
    //左指针类型
    int leftType;
    //右指针类型
    int rightType;

    public ThreadedNode(int value) {
        this.value = value;
    }

    public void setLeftNode(ThreadedNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(ThreadedNode rightNode) {
        this.rightNode = rightNode;
    }

}
