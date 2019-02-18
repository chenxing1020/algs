package cx.Sort;

import java.util.Arrays;

/**
 * 堆排序
 * 首先从最后一个父节点开始将树变成大顶堆
 * 然后将第一个数与最后一个元素交换位置，最后一个数即排序成功
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        // 开始位置是最后一个非叶子结点，即最后一个父结点
        int start = (arr.length - 1) / 2;
        // 从最后一个父结点开始将整个完全二叉树变为大顶堆
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            //将数组中第0个和堆中最后一个数交换位置
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // 此时的第i个数排序成功
            // 将剩下i-1个数重新建立大顶堆
            maxHeap(arr, i, 0);
        }
    }

    //将index结点的子树变为大顶堆
    public static void maxHeap(int[] arr, int size, int index) {
        //左子结点
        int leftNode = 2 * index + 1;
        //右子结点
        int rightNode = 2 * index + 2;
        int max = index;
        if (leftNode < size && arr[leftNode] > arr[max]) max = leftNode;
        if (rightNode < size && arr[rightNode] > arr[max]) max = rightNode;

        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            //交换位置以后可能破坏之前排好的堆
            maxHeap(arr, size, max);
        }
    }
}
