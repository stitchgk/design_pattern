package com.github.stitchgk.composite.adapter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class BinarySearch {
    public int binarySearch(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
