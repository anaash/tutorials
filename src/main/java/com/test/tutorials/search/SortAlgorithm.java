package com.test.tutorials.search;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;

@Component
public interface SortAlgorithm {

    public int [] sortData (int [] data);
}
