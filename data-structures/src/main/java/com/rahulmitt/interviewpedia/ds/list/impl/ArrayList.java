package com.rahulmitt.interviewpedia.ds.list.impl;

import com.rahulmitt.interviewpedia.ds.list.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayList implements List {

    private int[] arr;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    private static Logger logger = LoggerFactory.getLogger(ArrayList.class);

    public ArrayList() {
        this.arr = new int[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        this.arr = new int[initialCapacity];
    }

    public ArrayList(int... elements) {
        this.size = elements.length;
        this.arr = new int[size];
        System.arraycopy(elements, 0, arr, 0, size);
        logger.info("Created ArrayList with {} capacity", arr.length);
    }

    private void resize() {
        int[] arr = new int[this.arr.length * 2];
        System.arraycopy(this.arr, 0, arr, 0, this.arr.length);
        this.arr = arr;
        logger.info("Resized to {} capacity", arr.length);
    }

    @Override
    public void display() {
        logger.info(this.toString());
    }

    @Override
    public void add(int x) {
        if (size == arr.length) resize();
        arr[size++] = x;
    }

    @Override
    public void insert(int index, int x) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        if (size == arr.length) resize();
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = x;
        size++;
    }

    @Override
    public int delete(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        int deleted = arr[index];
        System.arraycopy(arr, index + 1, arr, index, size - index);
        return deleted;
    }

    @Override
    public int linearSearch(int x) {
        for (int i = 0; i < size; i++) if (arr[i] == x) return i;
        return -1;
    }

    @Override
    public int binarySearch(int x) {
        int low = 0;
        int high = size;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) high = mid;
            else if (arr[mid] > x) low = mid;
            else return mid;
        }
        return -1;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return arr[index];
    }

    @Override
    public void set(int index, int x) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        arr[index] = x;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    @Override
    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) if (arr[i] < min) min = arr[i];
        return min;
    }

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++) sum += arr[i];
        return sum;
    }

    @Override
    public int avg() {
        return sum() / size;
    }

    @Override
    public void reverseUsingAuxiliaryArray() {
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) newArr[i] = arr[size - 1 - i];
        arr = newArr;
    }

    @Override
    public void reverseUsingSwapMethod() {
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
    }

    @Override
    public void leftShift() {
        //TODO:
    }

    @Override
    public void leftRotate() {
        //TODO:
    }

    @Override
    public void insertInSortedList(int x) {
        //TODO:
    }

    @Override
    public boolean isSorted() {
        if (size <= 1) return true;
        for (int i = 1; i < size; i++) if (arr[i - 1] > arr[i]) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) sb.append(arr[i]).append(", ");
        sb.append("]");
        return sb.toString();
    }
}
