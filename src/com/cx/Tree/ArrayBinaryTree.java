package com.cx.Tree;

/**
 * 顺序结构的二叉树(只适用于完全二叉树)
 */
public class ArrayBinaryTree {
    int[] data;
    public ArrayBinaryTree(int[] data){
        this.data=data;
    }

    //前序遍历 中左右
    public void frontShow(int index){
        if (data==null || data.length==0) return;
        System.out.print(data[index]);
        //左子结点 下标为2*index+1
        if (2*index+1<data.length) frontShow(2*index+1);
        //右子结点 下标为2*index+2
        if (2*index+2<data.length) frontShow(2*index+2);

    }
}
