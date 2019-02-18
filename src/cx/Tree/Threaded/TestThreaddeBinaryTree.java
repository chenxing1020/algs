package cx.Tree.Threaded;

public class TestThreaddeBinaryTree {

    public static void main(String[] args) {

        ThreadedBinaryTree threadBinTree=new ThreadedBinaryTree();
        ThreadedNode root=new ThreadedNode(1);
        ThreadedNode L=new ThreadedNode(2);
        ThreadedNode R=new ThreadedNode(3);
        ThreadedNode LL=new ThreadedNode(4);
        ThreadedNode LR=new ThreadedNode(5);

        threadBinTree.setRoot(root);
        root.setLeftNode(L);
        root.setRightNode(R);
        L.setLeftNode(LL);
        L.setRightNode(LR);

        //中序线索化二叉树
        threadBinTree.threadNodes();
        //中序遍历
        threadBinTree.midShow();

    }
}
