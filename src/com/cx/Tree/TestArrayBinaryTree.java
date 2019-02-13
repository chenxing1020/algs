package com.cx.Tree;

public class TestArrayBinaryTree {
    public static void main(String[] args) {
        int[]  data=new int[] {1,2,3,4,5,6,7};
        ArrayBinaryTree arrBinTree=new ArrayBinaryTree(data);

        //前序遍历
        arrBinTree.frontShow(0);
        System.out.println();
    }
}
