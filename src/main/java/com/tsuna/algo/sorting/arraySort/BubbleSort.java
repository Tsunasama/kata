package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class BubbleSort implements IArraySortStrategy {

    public void sort(int[] array, int count) throws Exception {
        if(array.length-1 < count)
            throw  new InvalidParameterSpecException("Parameter wrong!");
        boolean isExchanged;
        for (int i = 1; i < count; i++) {
            isExchanged = false;
            for (int j = 1; j <= count - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[0] = array[j]; /* exchange array[j] and array[j+1] */
                    array[j] = array[j + 1];
                    array[j+1]=array[0];
                    isExchanged=true;
                }
            }
            if(!isExchanged)
                break;
        }
    }
}
