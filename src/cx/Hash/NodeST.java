package cx.Hash;

/**
 * 基于链表的符号表
 */
public class NodeST<Key,Value> {

    //链表首结点
    private Node root;

    private class Node{
        //链表结点
        Key key;
        Value value;
        Node next;

        public Node(Key key,Value value,Node next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }

    //查找给定的健，返回相关的值
    public Value get(Key key){
        for (Node x=root;x!=null;x=x.next){
            if (key.equals(x.key)){
                return x.value;
            }
        }
        return null;
    }

    //查找指定的健，更新相关值
    public void put(Key key,Value value){
        for (Node x=root;x!=null;x=x.next){
            if (key.equals(x.key)){
                x.value=value;
                return;
            }
        }
        //未命中，则新建结点，新结点的next指向root
        root=new Node(key,value,root);
    }

}
