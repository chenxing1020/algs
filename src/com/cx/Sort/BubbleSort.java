package com.cx.Sort;

import java.util.Arrays;

/**
 * 冒泡排序，两两比较，每次找到当前最大的数
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 9, 4, 1, 0, 5, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {

        //每一轮排序找到第i+1大的值
        //需要找length-1个最大值
        //循环共执行length-1轮
        for (int i = 0; i < arr.length - 1; i++) {

            //每一轮循环都是从头两两比较
            //i-1轮已经排好的i-1个数字不参与比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
