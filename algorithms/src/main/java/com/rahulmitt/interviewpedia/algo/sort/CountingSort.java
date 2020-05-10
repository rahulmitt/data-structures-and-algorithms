package com.rahulmitt.interviewpedia.algo.sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 2, 1, 0, 0, 4, 3, 4, 2};
        //int[] intArray = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0};
        System.out.println("Original:     " + Arrays.toString(intArray));
        //countingSort(intArray, 0, 1);
        countingSort(intArray, 0, 4);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));
    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }
}
