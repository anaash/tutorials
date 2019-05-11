package com.test.tutorials.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TernarySearch {

    @Autowired
    SortAlgorithm quickSortAlgorithm;

    public int searchIndex (int [] data){
        // Sort Data
        quickSortAlgorithm.sortData(data);


        // Do Search
        return 3;
    }
}
