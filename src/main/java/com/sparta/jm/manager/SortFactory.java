package com.sparta.jm.manager;

import com.sparta.jm.sorters.BubbleSort;
import com.sparta.jm.sorters.MergeSort;
import com.sparta.jm.sorters.Quicksort;
import com.sparta.jm.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SortFactory {
    private static final String PATH = "resources/sort.properties";
    private static final String KEY = "sort";

    public static Sorter getInstance(){
        String sortType = null;
        try{
            Properties properties = new Properties();
            properties.load(new FileReader(PATH));
            sortType = properties.getProperty(KEY);
        } catch (IOException e){
            e.printStackTrace();
        }


        if (sortType.equals("bubble")){
            return new BubbleSort();
        }
        else if (sortType.equals("merge")){
            return new MergeSort();
        }
        else if(sortType.equals("quicksort")){
            return new Quicksort();
        }
        else{
            return null;
        }
    }
}

