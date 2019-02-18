package cx.Tree.AVL;

/**
 * 二叉平衡树
 * 二叉搜索树容易出现左子树和右子树高度差相差很多的情况，效率会大幅度降低
 * 二叉平衡树规定左子树和右子树的高度差不能大于1
 */
public class AVLTree {

    Node root;

    //向二叉排序树中添加结点
    public void add(Node node){
        //空树
        if (root==null){
            root=node;
        }else{
            root.add(node);
        }
    }
}
