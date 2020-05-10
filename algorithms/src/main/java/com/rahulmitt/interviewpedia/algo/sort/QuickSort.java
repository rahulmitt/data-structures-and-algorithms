package com.rahulmitt.interviewpedia.algo.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        System.out.println("Original: " + Arrays.toString(intArray));
        quickSort(intArray, 0, intArray.length);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int pivotIdx = partition(input, start, end);
        quickSort(input, start, pivotIdx);
        quickSort(input, pivotIdx + 1, end);
    }

    // this is using the first element as the pivot
    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot) ; // empty loop body
            if (i < j) input[i] = input[j];

            while (i < j && input[++i] <= pivot) ; // empty loop body
            if (i < j) input[j] = input[i];
        }

        input[j] = pivot;
        return j;
    }
}
