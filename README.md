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
类[ArrayBinaryTree.java](./src/com/cx/Tree/ArrayBinaryTree.java)  
应用：堆排序

|顺序存储二叉树的操作|方法|
|---|---|
|前序遍历|frontShow(i)|

### 线索二叉树

遍历高效  
类[ThreadedBinaryTree.java](./src/com/cx/Tree/ThreadedBinaryTree.java)  
结点类[ThreadedNode.java](./src/com/cx/Tree/ThreadedNode.java)  

|线索二叉树的操作|方法|
|---|---|
|中序线索化|threadNodes(node)|
|中序遍历|mi'dShow()|

### 霍夫曼树

带权路径最小，可用于压缩编码。  
类[HuffmanTree.java](./src/com/cx/Tree/HuffmanTree.java)  

### 二叉排序树

有序的顺序存储查找方便，插入困难；  
无序的顺序存储查找困难，插入简单；  
链式存储插入和查找都困难；  
二叉排序树插入和查找性能都不会太差。  
类[BinarySortTree.java](./src/com/cx/Tree/BinarySortTree.java)  
结点类[Node.java](./src/com/cx/Tree/Node.java)  

|二叉排序树的操作|方法|
|---|---|
|插入结点|add(node)|
|查找结点|search(value)|
|删除结点|delete(value)|