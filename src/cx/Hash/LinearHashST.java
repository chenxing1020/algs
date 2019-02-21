package cx.Hash;

/**
 * 基于线性探测的符号表
 */
public class LinearHashST<Key, Value> {

    //探测表的大小
    private int M = 16;
    //符号表中键值对的总数
    private int N;
    //健数组
    private Key[] keys;
    //值数组
    private Value[] values;

    public LinearHashST() {
        keys = (Key[]) new Object[M];
        values = (Value[]) new Object[M];
    }

    public LinearHashST(int cap){
        keys=(Key[]) new Object[cap];
        values=(Value[]) new Object[cap];
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    //扩容
    private void resize(int cap) {
        LinearHashST<Key,Value> temp;
        temp=new LinearHashST<Key,Value>(cap);
        for (int i=0;i<M;i++){
            if (keys[i]!=null) temp.put(keys[i],values[i]);
        }
        keys=temp.keys;
        values=temp.values;
        M=temp.M;
    }

    //插入键值对
    public void put(Key key, Value value) {
        //当探测表的键值对总数超过探测表长度的1/2时就进行扩容
        if (N>= M/2) resize(2*M);
        int i;
        //如果计算出来的索引位置已经有键，且与当前的键不匹配，就不断后移
        for (i = hash(key); keys[i] != null; i = (i + 1) % M)
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        keys[i] = key;
        N++;
    }

    public Value get(Key key){
        int i;
        for (i=hash(key);keys[i]!=null;i=(i+1)%M)
            if (keys[i].equals(key)){
                return values[i];
            }
        return null;
    }

    //删除操作，不仅需要删除当前的键，还需要将长键簇中被删除键的右侧所有键重新插入散列表
}
