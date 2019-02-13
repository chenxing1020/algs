package com.cx.Tree;

public class TestBinaryTree {

    public static void main(String[] args) {
        //创建一个二叉树
        BinaryTree binTree=new BinaryTree();
        TreeNode root=new TreeNode(1);
        TreeNode rootL=new TreeNode(2);
        TreeNode rootR=new TreeNode(3);
        binTree.setRoot(root);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));

        //前序遍历
        binTree.frontShow();
        System.out.println();
        //中序遍历
        binTree.midShow();
        System.out.println();
        //后序遍历
        binTree.afterShow();
        System.out.println();

        //前序查找
        System.out.println(binTree.frontSearch(5));
        System.out.println(binTree.frontSearch(8));

        //删除一个子树
        binTree.delete(4);
        binTree.frontShow();

    }
}
