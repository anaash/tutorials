package com.test.tutorials;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sortData(int[] data) {
        return data;
    }
}
