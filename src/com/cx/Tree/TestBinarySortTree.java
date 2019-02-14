package com.cx.Tree;

public class TestBinarySortTree {

    public static void main(String[] args) {
        int[] arr=new int[] {7,3,10,12,5,1,9};
        BinarySortTree bst=new BinarySortTree();
        for (int i:arr){
            bst.add(new Node(i));
        }

        bst.midShow();
        System.out.println(bst.search(10));
        System.out.println(bst.search(23));

        bst.delete(20);
        bst.midShow();
    }
}
