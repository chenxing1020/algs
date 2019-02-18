package cx.Tree.AVL;

/**
 * 平衡树结点类
 */
public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    //返回当前结点左子结点的高度和右子结点高度较大值+1
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
    }
    //平衡因子
    public int BF(){
        return (left==null?0:left.height())-(right==null?0:right.height());
    }

    //向子树添加结点
    public void add(Node node) {
        if (node == null) return;

        if (node.value < this.value) {
            if (this.left == null) this.left = node;
            else this.left.add(node);
        } else if (node.value > this.value) {
            if (this.right == null) this.right = node;
            else this.right.add(node);
        }

        int bf=BF();
        //检查此时二叉树是否平衡

        if (bf >= 2) {
            //右旋转，LL右单旋，LR左右双旋
            if (left.BF()<0){
                //左子树的平衡因子<0，即LR情况，先左旋
                left.leftRotate();
                //此时转换为LL
            }
            rightRotate();
        } else if (bf<=-2) {
            //左旋转，RR左单旋，RL右左双旋
            if (right.BF()>0){
                //左子树的平衡因子>0，即RL情况，先右旋
                right.rightRotate();
                //此时转换为RR
            }
            leftRotate();
        }
    }

    //左旋转
    private void leftRotate() {
        //创建一个新结点，值等于当前结点的值
        Node newLeft=new Node(value);
        //新结点的左子树为当前结点的左子树
        newLeft.left=left;
        //新结点的右子树为当前结点的右子树的左子树
        newLeft.right=right.left;
        //当前结点的值为当前结点的右子树的值
        value=right.value;
        //当前结点的右子树为右子树的右子树
        right=right.right;
        //当前结点的左子树为新结点
        left=newLeft;
    }

    //右旋转
    private void rightRotate() {
        //创建一个新结点，值等于当前结点的值
        Node newRight=new Node(value);
        //把当前结点的右子树设为新结点的右子树
        newRight.right=right;
        //将当前结点的右子树设置为新结点的左子树
        newRight.left=left.right;
        //把当前结点的值换成左子结点的值
        value=left.value;
        //把当前结点的左子树替换成左子树的左子树
        left=left.left;
        //把当前结点的右子树替换成新结点
        right=newRight;
    }
}
