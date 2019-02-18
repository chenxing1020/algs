package cx.Sort;

import java.util.Arrays;

/**
 * 归并排序，分治+合并
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 10, 2, 8, 9, 8, 7, 5, 1, 8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        int middle = (high + low) / 2;
        if (low < high) {
            //递归处理子序列
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            //合并有序子序列
            merge(arr, low, high);
        }
    }

    public static void merge(int[] arr, int low, int high) {
        int middle = (high + low) / 2;
        //存储归并后的临时数组
        int[] temp = new int[high - low + 1];
        //记录两个数组的下标
        int i = low, j = middle + 1;
        int index = 0;
        while (i <= middle && j <= high) {
            //两个数组各自当前下标的较小数放入临时数组
            if (arr[i] < arr[j]) temp[index] = arr[i++];
            else temp[index] = arr[j++];
            index++;
        }
        //处理多余数据
        while (i <= middle) {
            temp[index++] = arr[i++];
        }
        while (j <= high) {
            temp[index++] = arr[j++];
        }
        //把临时数组中的数据存入数组
        for (int k = 0; k < temp.length; k++) {
            arr[k + low] = temp[k];
        }
    }
}
