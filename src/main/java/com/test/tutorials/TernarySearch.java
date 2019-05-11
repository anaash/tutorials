package com.test.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TernarySearch {

    @Autowired
    SortAlgorithm sortAlgorithm;

    public int searchIndex (int [] data){
        // Sort Data
        sortAlgorithm.sortData(data);


        // Do Search
        return 3;
    }
}
