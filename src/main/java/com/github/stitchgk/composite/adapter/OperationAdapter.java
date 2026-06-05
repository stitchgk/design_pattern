package com.github.stitchgk.composite.adapter;

/**
 * @author: jiaofanghao
 * @time: 2026/6/4
 **/
public class OperationAdapter implements ScoreOperation{

    private BinarySearch binarySearch;
    private QuickSort quickSort;

    public OperationAdapter() {
       quickSort = new QuickSort();
       binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}
