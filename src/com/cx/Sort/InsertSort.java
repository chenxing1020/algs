package com.cx.Sort;

import java.util.Arrays;

/**
 * 插入排序，默认当前位置之前的序列都是有序的
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 10, 9, 5, 6, 4, 6, 2, 7, 3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        //遍历所有数字，默认当前位置之前均有序
        for (int i = 1; i < arr.length; i++) {
            //如果当前数字小于前一个数，代表要将当前数字插入前面的有序序列
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                //比当前数字大的数都依次后移
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }
}
