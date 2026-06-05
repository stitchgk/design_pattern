package com.github.stitchgk.composite.adapter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class QuickSort {

    public int[] quickSort(int[] a) {
        sort(a, 0, a.length - 1);
        return a;
    }

    public void sort(int[] array, int p, int r) {
        int q = 0;
        if (p < r) {
            q = partition(array, p ,r);
            sort(array, p, q - 1);
            sort(array, q + 1, r);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        int j = p - 1;
        for (int i = p; i < r; i++) {
            if (a[i] <= x) {
                j++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        swap(a, j + 1, r);
        return j + 1;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
