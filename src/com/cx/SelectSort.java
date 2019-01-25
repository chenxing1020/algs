package com.cx;

import java.util.Arrays;

/**
 * 选择排序，每次遍历找出未排序数中的最小数
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 7, 8, 1, 2, 0, 4, 7, 4, 3, 8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //遍历每一个数字
        for (int i = 0; i < arr.length - 1; i++) {
            //记录未排序数字中最小数的下标
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) index = j;
            }

            if (index != i) {
                //将当前未排序数字中的最小数交换到当前位置
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }

        }
    }
}
