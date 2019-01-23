package com.cx;

//双向循环链表
public class DoubleNode {
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void after(DoubleNode node) {
        DoubleNode nextNext = next;
        this.next = node;
        node.pre = this;

        node.next = nextNext;
        nextNext.pre = node;
    }

    //下一个节点
    public DoubleNode next() {
        return this.next;
    }

    //上一个节点
    public DoubleNode pre() {
        return this.pre;
    }

    public int getData() {
        return this.data;
    }
}
