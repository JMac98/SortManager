package com.sparta.jm.sorters;

import java.util.Arrays; //italic = static

public class MergeSort implements Sorter{
    @Override
    public int[] getSortedArray(int[] unsortedArray) {
        if(unsortedArray.length == 1) {
            return unsortedArray;
        }
        int midpoint = unsortedArray.length / 2;
        int[] leftArray = Arrays.copyOfRange(unsortedArray,0,midpoint);
        int[] rightArray = Arrays.copyOfRange(unsortedArray,midpoint,unsortedArray.length);

        int[] sortedArray = mergeArray(getSortedArray(leftArray),getSortedArray(rightArray));
        return sortedArray;
    }

    private int[] mergeArray(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while(i < array1.length && j < array2.length){
            if(array1[i]<=array2[j]){
                mergedArray[k++] = array1[i++];
            }
            else{
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }
        return mergedArray;
    }

    @Override
    public String toString(){
        return "Merge Sorter";
    }

}
