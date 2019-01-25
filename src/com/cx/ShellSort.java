package com.cx;

import java.util.Arrays;

/**
 * 希尔排序，设置步长的插入排序，使比较小或者比较大的数字可以尽快地移动到数组的两端。
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 7, 8, 1, 2, 0, 4, 7, 4, 3, 8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        //设置步长
        int step = arr.length / 2;
        while (step >= 1) {
            //设置步长相当于将序列分成很多个子序列，每个子序列分别进行插入排序
            //且默认当前位置之前的子序列均是有序的
            for (int i = step; i < arr.length; i++) {
                //如果子序列前一个数大于当前位置的数，即需要将当前位置的数插入子序列
                if (arr[i - step] > arr[i]) {
                    int temp = arr[i];
                    int j;
                    //大于当前位置的数的数字依次后移step位
                    for (j = i - step; j >= 0 && arr[j] >= temp; j -= step) {
                        arr[j + step] = arr[j];
                    }
                    //插入当前位置的数
                    arr[j + step] = temp;
                }
            }
            //步长缩小
            step /= 2;
        }
    }
}
