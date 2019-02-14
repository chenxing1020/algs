package com.cx.Tree;

/**
 * 哈夫曼树结点类
 */
public class Node implements Comparable<Node> {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    //向子树添加结点
    public void add(Node node) {
        if (node == null) {
            return;
        }
        if (node.value < this.value) {
            if (this.left == null) this.left = node;
            else this.left.add(node);

        } else {
            if (this.right == null) this.right = node;
            else this.right.add(node);
        }
    }

    //二叉排序树的中序遍历就是从小到大排序的结果
    public void midShow(Node node){
        if (node==null) return;

        midShow(node.left);
        System.out.print(node.value+" ");
        midShow(node.right);
    }

    //结点的查找
    public Node search(int value){
        if (this.value==value){
            return this;
        }else if (value<this.value) {
            if (left==null) return null;
            return left.search(value);
        }else{
            if (right==null) return null;
            return right.search(value);
        }
    }

    //搜索父结点
    public Node searchParent(int value){
        if ((this.left!=null && this.left.value==value)||(this.right!=null && this.right.value==value)) return this;
        else{
            if (this.value>value&&this.left!=null) return this.left.searchParent(value);
            else if (this.value<value && this.right!=null) return this.right.searchParent(value);
        }
        return null;
    }
}

