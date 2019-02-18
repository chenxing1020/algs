package cx.Sort;

import java.util.Arrays;

/**
 * 快速排序，找一个基准数，固定基准数的位置，然后不断分治
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{6,1,2,7,9,8,8,5,10,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int start, int end) {
        //递归结束标志
        if (start >= end) return;

        //基准数
        int pivot = arr[start];

        //低位、高位下标记录
        int lo = start;
        int hi = end;

        while (lo < hi) {
            //如果高位数大于基准数，高位指针左移
            while (lo < hi && pivot <= arr[hi]) hi--;
            //如果低位数小于基准数，低位指针右移
            while (lo < hi && pivot >= arr[lo]) lo++;

            //交换当前找到比基准数大的低位数和比基准数小的高位数
            if (lo < hi) {
                int swap = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = swap;
            }
        }

        //低位指针和高位指针重合，此时指针左边的数均比基准数小，右边的数均比基准数大
        //将当前指针位置的数和基准数交换
        arr[start] = arr[lo];
        arr[lo] = pivot;

        quickSort(arr, start, lo);
        quickSort(arr, lo + 1, end);

    }
}
