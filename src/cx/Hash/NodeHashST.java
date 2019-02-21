package cx.Hash;

/**
 * 基于拉链法的散列表，通过计算散列函数得到健值的索引
 */
public class NodeHashST<Key,Value> {

    private NodeST<Key,Value>[] nst;
    private int M;

    public NodeHashST(){
        this(997);
    }
    public NodeHashST(int M){
        //创建M条链表符号表
        //java不允许泛型数组，需要进行类型转换
        nst=(NodeST<Key, Value>[]) new NodeST[M];
        this.M=M;
        for (int i=0;i<M;i++){
            nst[i]=new NodeST();
        }
    }

    private int hash(Key key){
        // 所有健都变成31位无符号整数
        // 然后除留余数法计算hash值
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public  Value get (Key key){
        return (Value) nst[hash(key)].get(key);
    }

    public void put (Key key,Value value){
        nst[hash(key)].put(key,value);
    }


}
