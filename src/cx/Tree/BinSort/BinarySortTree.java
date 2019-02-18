package cx.Tree.BinSort;

/**
 * 二叉排序树，每个结点的值都比左子结点大，比右子结点小
 */
public class BinarySortTree{
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

    //中序遍历的结果就是有序的数列
    public void midShow(){
        if (root!=null){
            root.midShow(root);
        }
    }

    //查找
    public Node search(int value){
        if (root==null) return null;
        return root.search(value);
    }

    //删除结点
    public void delete(int value){
        if (root==null) return;
        else {
            Node target=search(value);
            if (target==null) return;

            Node parent=searchParent(value);
            //删除叶子结点
            if (target.left==null && target.right==null){
                //要删除的结点是父结点的左子结点
                if (parent.left.value==value) parent.left=null;
                else parent.right=null;
            }
            //要删除的结点有两个子结点
            else if (target.left!=null&&target.right!=null){
                //删除右子树中值最小的结点，并用右子树中最小的值替换该节点
                int min=deleteMin(target.right);
                target.value=min;
            }else{
                //要删除的结点只有一个左子结点
                if (target.left!=null){
                    if (parent.left.value==value){
                        parent.left=target.left;
                    }else{
                        parent.right=target.left;
                    }
                }
                //要删除的结点只有一个右子结点
                else{
                    if (parent.left.value==value){
                        parent.left=target.right;
                    }else{
                        parent.right=target.right;
                    }
                }
            }
        }

    }

    //删除右子树中最小值的结点
    public int deleteMin(Node right){
        Node target=right;
        while (target.left!=null){
            target=target.left;
        }

        delete(target.value);
        return target.value;
    }

    //找到目标结点的双亲结点
    public Node searchParent(int value){
        if (root==null) return null;
        else return root.searchParent(value);
    }



}
