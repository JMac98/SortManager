package com.sparta.jm.sorters;

import com.sparta.jm.manager.App;

public class BubbleSort implements Sorter{
    // o(n^2)

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

    // const PI_NUMBER = 3.1697 /// == checks equiality between prmitave

    @Override
    public String toString(){
        return "Bubble Sorter";
    }

}
