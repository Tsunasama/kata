package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class StraightInsertArraySort implements IArraySortStrategy{
    public void sort(int[] array, int count) throws InvalidParameterSpecException{
        if(array.length-1 < count)
            throw  new InvalidParameterSpecException("Parameter wrong!");
        for(int i=2;i<=count;i++){ /* i:the index to insert */
           array[0]=array[i]; /* set scout (array[0]) */
           int j=i-1;
           while(array[0]<array[j]){
               array[j+1]=array[j];
               j--;
           }
           array[j+1]=array[0];
       }
    }
}
