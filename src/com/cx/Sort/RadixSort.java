package com.cx.Sort;

import com.cx.Linear.MyQueue;

import java.util.Arrays;

/**
 * 基数排序，分配式排序，每次按照数字的个位、十位...将元素分配至某些桶中
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 6, 189, 45, 9, 287, 56, 1, 798, 34, 65, 652, 5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        //找到数组中最大数，确定排序次数
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        //小tip:将数字转换成字符串从而计算其位数
        int maxLength = (max + "").length();
        MyQueue[] temp = new MyQueue[10];
        for (int i = 0; i < temp.length; i++) temp[i] = new MyQueue();

        //不断除10取余
        int n = 1;

        for (int i = 0; i < maxLength; i++) {
            //遍历数组，将每一个数放入指定的队列
            for (int j = 0; j < arr.length; j++) {
                int nums = arr[j] / n % 10;
                temp[nums].add(arr[j]);
            }

            //依次取数
            int index = 0;
            for (int k = 0; k < temp.length; k++) {
                while (!temp[k].isEmpty()) {
                    arr[index++] = temp[k].poll();
                }
            }
            //取下一位
            n *= 10;
        }

    }
}
