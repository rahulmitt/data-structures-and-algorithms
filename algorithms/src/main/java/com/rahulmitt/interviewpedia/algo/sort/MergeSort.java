package com.rahulmitt.interviewpedia.algo.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Original: " + Arrays.toString(intArray));
        mergeSort(intArray, 0, intArray.length);
        System.out.println("Sorted: " + Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) return;

        int i = start;
        int j = mid;
        int tempIdx = 0;
        int[] tempArr = new int[end - start];

        while (i < mid && j < end) {
            tempArr[tempIdx++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // copy the leftover elements from the left array
        System.arraycopy(input, i, input, start + tempIdx, mid - i);

        // any leftover elements in the right array need not be copied

        //copy the temp array to the input array
        System.arraycopy(tempArr, 0, input, start, tempIdx);
    }
}
