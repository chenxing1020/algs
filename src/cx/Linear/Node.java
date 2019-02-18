package cx.Linear;

public class Node {
    private int data;
    private Node next;

    //构造函数
    public Node(int value) {
        data = value;
    }

    //加入节点
    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            Node nextNode = currentNode.next;
            if (nextNode == null) break;
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    //获取next节点
    public Node next() {
        return this.next;
    }

    //获取节点值
    public int getData() {
        return this.data;
    }

    //显示所有列表
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
            if (currentNode == null) {
                System.out.println();
                break;
            }
        }
    }

    //删除下一个节点
    public void removeNext() {
        Node newNext = this.next;
        if (newNext == null) throw new RuntimeException("this node has no next");
        this.next = newNext.next;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(Node node){
        Node nextNext=this.next;
        this.next=node;
        node.next=nextNext;
    }
}
