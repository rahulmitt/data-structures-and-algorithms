package com.rahulmitt.interviewpedia.ds.list;

public interface List {

    void display();                     // Visit all the elements of the array one by one

    void add(int x);                    // Add a new element at the end of the array

    void insert(int index, int x);      // Insert an element at a given index

    int delete(int index);              // Delete an element at a given index

    int linearSearch(int x);            // Search the given element and return the index

    int binarySearch(int x);            // Search the given element and return the index

    int get(int index);                 // Get the element at a given index

    void set(int index, int x);         // Replace the element at a given index

    int size();                         // Returns the count of elements

    int max();                          // Find the max element in unsorted array

    int min();                          // Find the min element in unsorted array

    int sum();                          // Find the sum of all elements in unsorted array

    int avg();                          // Find the average of all elements in unsorted array

    void reverseUsingAuxiliaryArray();

    void reverseUsingSwapMethod();

    void leftShift();

    void leftRotate();

    void insertInSortedList(int x);

    boolean isSorted();
}
