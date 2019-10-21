package com.sparta.jm.display;

import java.util.Arrays;

public class DisplayManager {

    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted array using: " + sortType);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}
