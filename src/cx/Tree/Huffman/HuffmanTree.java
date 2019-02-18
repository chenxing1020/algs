package cx.Tree.Huffman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {

    public static void main(String[] args) {
        int[]  arr={3,7,8,29,5,11,23,14};

        Node node=createHuffmanTree(arr);
        System.out.println(node.toString());
    }

    public static Node createHuffmanTree(int[] arr){
        List<Node> nodes=new ArrayList<>();
        for (int value:arr){
            nodes.add(new Node(value));
        }

        while(nodes.size()>1){
            //排序
            Collections.sort(nodes);
            //取出权值最小的两个二叉树
            Node left=nodes.get(nodes.size()-1);
            Node right=nodes.get(nodes.size()-2);
            //组成新的二叉树
            Node parent=new Node(left.value+right.value);
            parent.left=left;
            parent.right=right;
            //替换集合中的结点
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }
}
