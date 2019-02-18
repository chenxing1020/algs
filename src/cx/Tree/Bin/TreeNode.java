package cx.Tree.Bin;

/**
 * 结点类
 */
public class TreeNode {
    //结点的权
    private int value;
    //左结点
    private TreeNode lNode;
    //右结点
    private TreeNode rNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode lNode) {
        this.lNode = lNode;
    }

    public void setRightNode(TreeNode rNode) {
        this.rNode = rNode;
    }

    public TreeNode getlNode() {
        return this.lNode;
    }

    public TreeNode getrNode() {
        return this.rNode;
    }

    public int getValue() {
        return this.value;
    }

    //前序遍历 中左右
    public void frontShow() {
        System.out.print(value);
        if (lNode != null) lNode.frontShow();
        if (rNode != null) rNode.frontShow();
    }

    //中序遍历 左中右
    public void midShow() {
        if (lNode != null) lNode.midShow();
        System.out.print(value);
        if (rNode != null) rNode.midShow();
    }

    //后序遍历 左右中
    public void afterShow() {
        if (lNode != null) lNode.afterShow();
        if (rNode != null) rNode.afterShow();
        System.out.print(value);
    }

    /**
     * 树的查找
     */
    //前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //先比较当前结点
        if (this.value == i) {
            return this;
        } else {
            //查找左结点
            if (lNode != null) {
                target = lNode.frontSearch(i);
            }
            if (target != null) return target;
            //查找右结点
            if (rNode != null) {
                target = rNode.frontSearch(i);
            }
        }
        return target;
    }

    /**
     * 删除子树
     */
    public void delete(int i) {
        TreeNode current = this;

        //判断左右子结点是否是待删除的结点
        if (current.getlNode() != null && current.getlNode().getValue()==i){
            current.setLeftNode(null);
            return;
        }
        if (current.getrNode() != null && current.getrNode().getValue()==i){
            current.setRightNode(null);
            return;
        }

        //否则进行递归
        if (current.getlNode() != null) current.getlNode().delete(i);
        if (current.getrNode() != null) current.getrNode().delete(i);

    }
}
