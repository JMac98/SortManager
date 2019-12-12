package com.sparta.jm.manager;

import com.sparta.jm.display.DisplayManager;
import com.sparta.jm.sorters.*;

import java.util.Random;

public class SortManager {

    private DisplayManager displayManager = new DisplayManager();
    private SortLoader loader = new SortLoader();

    public int[] arrayToSort = createArray(10);

//    public void sortArray() {
//
//        Sorter sorter = SortFactory.getInstance(); //get type of sorter from the properties file
//        int[] sortedArray = sorter.getSortedArray(unsortedArray.clone());
//
//        displaySortedArray(unsortedArray, sortedArray, sorter.toString());
//    }

//    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){ //helper method
//        DisplayManager displayManager = new DisplayManager();
//        displayManager.displaySortedArray(unsortedArray, sortedArray, sortType);
//    }

    public void sortArray(){
        try{
            String sortType = displayManager.displayTerminalSortTypeRequest(loader.getSortersLocation());

            int arraySize = displayManager.displayTerminalArraySizeRequest();

            arrayToSort = createArray(arraySize);
            long startTime = System.nanoTime();
            displayManager.printBeforeSort(arrayToSort);
            Sorter sorter = selectSorter(sortType);
            int[] sortedArray = sorter.getSortedArray(arrayToSort.clone());
            long endTime = System.nanoTime();
            displayManager.printAfterSort(sortedArray, endTime - startTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int[] createArray(int size){
        Random random = new Random();
        int[] unsortedArray = new int[size];
        for(int i = 0; i<size;i++){
            unsortedArray[i] = random.nextInt(size*20)+1;
        }
        return unsortedArray;
    }

    private Sorter selectSorter(String sortType){
        return loader.getSorter(sortType);
    }
}

//        int[] numbers =
//        MergeSort mergesort = new MergeSort();
//        System.out.println(Arrays.toString(mergesort.getSortedArray(numbers)));
//
//        int[] numbers2 = {50,20,1,30,5};
//        Quicksort quicksort = new Quicksort();
//        System.out.println(Arrays.toString(quicksort.getSortedArray(numbers2)));

