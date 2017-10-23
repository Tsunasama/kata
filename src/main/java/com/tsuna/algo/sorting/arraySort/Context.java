package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

class Context {
    private IArraySortStrategy sortStrategy;
    Context(IArraySortStrategy sortStrategy){
        this.sortStrategy=sortStrategy;
    }
    void sort(int[] array,int destinateIndex) throws Exception {
        sortStrategy.sort(array,destinateIndex);
    }
}
