/*
 * SelectSort    2017-11-28
 * Copyright(c) 2017 Chengguo Co.Ltd. All right reserved.
 *
 */
package com.example.cheng.mathalgorithm;

/**
 * 选择排序
 *
 * @author cheng
 * @version 1.0.0
 * @since 2017-11-28
 */
public class SelectSort {

    public void selectSort(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }

        for (int number : array) {
            System.out.println("   " + number);
        }
    }

    public static void main(String args[]) {
        SelectSort sort = new SelectSort();
        sort.selectSort(new int[]{9, 4, 2, 6, 7, 3, 10, 33, 88, 1, 1});
    }
}