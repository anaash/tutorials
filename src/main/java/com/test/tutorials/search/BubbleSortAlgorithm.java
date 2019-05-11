package com.test.tutorials.search;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Primary
@Qualifier(value = "Bubble")
@Component

public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sortData(int[] data) {
        return data;
    }
}
