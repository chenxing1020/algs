package cx.Linear;

public class LoopNode {
    private int data;

    //循环链表初始化
    private LoopNode next=this;

    //构造函数
    public LoopNode(int value) {
        data = value;
    }

    //获取next节点
    public LoopNode next() {
        return this.next;
    }

    //获取节点值
    public int getData() {
        return this.data;
    }

    //删除下一个节点
    public void removeNext() {
        LoopNode newNext = this.next;
        if (newNext == null) throw new RuntimeException("this node has no next");
        this.next = newNext.next;
    }

    //插入一个节点作为当前节点的下一个节点
    public void after(LoopNode node){
        LoopNode nextNext=this.next;
        this.next=node;
        node.next=nextNext;
    }
}
