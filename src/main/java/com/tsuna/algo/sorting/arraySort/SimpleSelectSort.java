package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class SimpleSelectSort implements IArraySortStrategy{
    public void sort(int[] array, int count) throws Exception {
        if(array.length-1 < count)
            throw  new InvalidParameterSpecException("Parameter wrong!");
        for(int i=1;i<count;i++){
            int min=i;
            for(int j=i+1;j<=count;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(i!=min){
                exchange(array,i,min); //exchange the minimum to the first place
            }
        }
    }
    private void exchange(int[] array,int index1,int index2){
        array[0]=array[index1];
        array[index1]=array[index2];
        array[index2]=array[0];
    }
}
