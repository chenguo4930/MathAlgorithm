/*
 * HeerSort    2017-09-14
 * Copyright(c) 2017 Chengguo Co.Ltd. All right reserved.
 *
 */
package com.example.cheng.mathalgorithm;

/**
 * 希尔排序
 *
 * @author cheng
 * @version 1.0.0
 * @since 2017-09-14
 */
public class HeerSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 44, 2, 0, 7, 28, 1, -9, 7, 2, 5, 23, 1, 21, 99, 7, 63, 8, 20, 14, 88, 56, -33};
        int d = a.length / 2;//默认增量为8
        while (true) {
            for (int i = 0; i < d; i++) {
                for (int j = i; j + d < a.length; j += d) {
                    //i = 0  j = 0,8
                    //i = 1  j = 1,9
                    int tmp;
                    if (a[j] > a[j + d]) {
                        tmp = a[j];
                        a[j] = a[j + d];
                        a[j + d] = tmp;
                    }
                }
            }
            if (d == 1) {
                break;
            }
            d--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}