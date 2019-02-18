package cx.Tree.AVL;

public class TestAVL {

    public static void main(String[] args) {
        AVLTree avl=new AVLTree();

//        //左左 右单旋
//        int[] arr=new int[]{8,9,6,7,5,4};
//        //右右 左单旋
//        int[] arr=new int[]{5,4,8,7,9,10};
//        //左右 左右双旋
//        int[] arr=new int []{8,5,9,4,6,7};
        //右左 右左双旋
        int[] arr=new int[]{5,4,8,7,9,6};
        for (int i:arr){
            avl.add(new Node(i));
        }
        System.out.println(avl.root.height());
        System.out.println(avl.root.value);
        System.out.println(avl.root.left.value);
        System.out.println(avl.root.right.value);



    }
}
