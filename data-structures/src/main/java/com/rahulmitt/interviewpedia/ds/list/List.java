package com.rahulmitt.interviewpedia.ds.list;

public interface List {

    // Visit all the elements of the array one by one
    void display();

    // Add a new element at the end of the array
    void add(int x);

    // Insert an element at a given index
    void insert(int index, int x);

    // Delete an element at a given index
    int delete(int index);

    // Search the given element and return the index
    int linearSearch(int x);

    // Search the given element and return the index
    int binarySearch(int x);

    // Get the element at a given index
    int get(int index);

    // Replace the element at a given index
    void set(int index, int x);

    // Find the max element in unsorted array
    int max();

    // Find the min element in unsorted array
    int min();

    int sum();

    int avg();

    void reverseUsingAuxiliaryArray();

    void reverseUsingSwapMethod();

    void leftShift();

    void leftRotate();

    void insertInSortedList(int x);

    boolean isSorted();
}
