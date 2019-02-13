# algs

## **线性结构**

|数据结构|类|
|---|---|
|栈|[MyStack.java](./src/com/cx/Linear/MyStack.java)|
|队列|[MyQueue.java](./src/com/cx/Linear/MyQueue.java)|
|单链表|[Node.java](./src/com/cx/Linear/Node.java)|
|循环链表|[LoopNode.java](./src/com/cx/Linear/LoopNode.java)|
|双向链表|[DoubleNode.java](./src/com/cx/Linear/DoubleNode.java)|

## **常用排序**

|排序方法|类|
|---|---|
|冒泡排序|[BubbleSort.java](./src/com/cx/Sort/BubbleSort.java)|
|快速排序|[QuickSort.java](./src/com/cx/Sort/QuickSort.java)|
|插入排序|[InsertSort.java](./src/com/cx/Sort/InsertSort.java)|
|希尔排序|[ShellSort.java](./src/com/cx/Sort/ShellSort.java)|
|选择排序|[SelectSort.java](./src/com/cx/Sort/SelectSort.java)|
|归并排序|[MergeSort.java](./src/com/cx/Sort/MergeSort.java)|
|基数排序|[RadixSort.java](./src/com/cx/Sort/RadixSort.java)|
|堆排序|[HeapSort.java](./src/com/cx/Sort/HeapSort.java)|

## **树**

### 链式存储的二叉树

类[BinaryTree.java](./src/com/cx/Tree/BinaryTree.java)  
结点类[TreeNode.java](./src/com/cx/Tree/TreeNode.java)

|链式二叉树的操作|方法|
|---|---|
|前序遍历|frontShow()|
|中序遍历|midShow()|
|后序遍历|afterShow()|
|前序查找|frontSearch(i)|
|删除子树|delete(i)|

### 顺序存储的二叉树

只适用于完全二叉树  
类[ArrayBinaryTree](./src/com/cx/Tree/ArrayBinaryTree.java)  
应用：堆排序

|顺序存储二叉树的操作|方法|
|---|---|
|前序遍历|frontShow(i)|