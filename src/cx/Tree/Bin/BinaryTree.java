package cx.Tree.Bin;

/**
 * 链式结构二叉树
 */
public class BinaryTree {
    private TreeNode root;

    /**
     * 设置根节点
     *
     * @param root
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 获取根节点
     *
     * @return
     */
    public TreeNode getRoot() {
        return this.root;
    }

    /**
     * 树的遍历
     */

    //前序遍历
    public void frontShow() {
        if (root == null) System.out.println("BinaryTree is empty");
        else root.frontShow();
    }

    //中序遍历
    public void midShow() {
        if (root == null) System.out.println("BinaryTree is empty");
        else root.midShow();
    }

    //后序遍历
    public void afterShow() {
        if (root == null) System.out.println("BinaryTree is empty");
        else root.afterShow();
    }

    /**
     * 树的查找
     */

    //前序查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    /**
     * 树的删除
     */
    public void delete(int i) {
        if (root == null) System.out.println("BinaryTree is empty");
        else {
            if (root.getValue() == i) {
                root = null;
                return;
            } else {
                root.delete(i);
            }
        }
    }
}
