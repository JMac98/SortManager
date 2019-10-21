package com.sparta.jm.sorters;

public class BubbleSort implements Sorter{
    @Override
    public int[] getSortedArray(int[] unsortedArray){
        for(int j = 0; j < unsortedArray.length-1;j++){
            for(int i = 0; i < unsortedArray.length-j-1; i++){
                if(unsortedArray[i] > unsortedArray[i+1]){
                    int temp = unsortedArray[i+1];
                    unsortedArray[i+1] = unsortedArray[i];
                    unsortedArray[i] = temp;
                }
            }
        }
        return unsortedArray;

    }


    @Override
    public String toString(){
        return "Bubble Sorter";
    }

}
