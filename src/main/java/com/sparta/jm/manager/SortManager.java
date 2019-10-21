package com.sparta.jm.manager;

import com.sparta.jm.display.DisplayManager;
import com.sparta.jm.sorters.*;

import java.util.Random;

public class SortManager {

    public void sortArray(String sortType) {
        int[] unsortedArray = createArray(10);

        Sorter sorter = SortFactory.getInstance();
        int[] sortedArray = sorter.getSortedArray(unsortedArray.clone());

        displaySortedArray(unsortedArray, sortedArray, sorter.toString());
    }

    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){ //helper method
        DisplayManager displayManager = new DisplayManager();
        displayManager.displaySortedArray(unsortedArray, sortedArray, sortType);
    }

    private int[] createArray(int size){
        Random random = new Random();
        int[] unsortedArray = new int[size];
        for(int i = 0; i<size;i++){
            unsortedArray[i] = random.nextInt(size*20)+1;
        }
        return unsortedArray;
    }
}



//        int[] numbers =
//        MergeSort mergesort = new MergeSort();
//        System.out.println(Arrays.toString(mergesort.getSortedArray(numbers)));
//
//        int[] numbers2 = {50,20,1,30,5};
//        Quicksort quicksort = new Quicksort();
//        System.out.println(Arrays.toString(quicksort.getSortedArray(numbers2)));

