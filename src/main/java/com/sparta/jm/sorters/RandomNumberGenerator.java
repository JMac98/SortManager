package com.sparta.jm.sorters;

import java.util.Random;

public class RandomNumberGenerator {

    public static int[] generateRandom(int size){
        Random random = new Random();
        int[] unsortedArray = new int[size];
        for(int i = 0; i<size;i++){
            unsortedArray[i] = random.nextInt(size*20)+1;
        }
        return unsortedArray;
    }

}
