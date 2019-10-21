package com.sparta.jm.manager;

import com.sparta.jm.sorters.MergeSort;
import com.sparta.jm.sorters.Quicksort;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        int[] numbers = {5,2,20,45,30};
        MergeSort mergesort = new MergeSort();
        System.out.println(Arrays.toString(mergesort.getSortedArray(numbers)));

//        int[] numbers2 = {45};
//        int[] numbers3 = {30};
//        MergeSort mergesort2 = new MergeSort();
//        System.out.println(Arrays.toString(mergesort2.mergeArray(numbers2,numbers3)));

        int[] numbers2 = {50,20,1,30,5};
        Quicksort quicksort = new Quicksort();
        System.out.println(Arrays.toString(quicksort.getSortedArray(numbers2)));

    }
}
