package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class QuickSort implements IArraySortStrategy {
    public void sort(int[] array, int count) throws Exception {
        if(array.length-1 < count)
            throw  new InvalidParameterSpecException("Parameter wrong!");
        quickSort(array,1,count);
    }
    private void quickSort(int[] array,int low,int high){
        if(low<high){
            int mid=partition(array,low,high);
            quickSort(array,low,mid-1);
            quickSort(array,mid+1,high);
        }
    }
    private int partition(int[] array,int low,int high){
        array[0]=array[low];
        while(low<high){
            while (high>low&&array[high]>=array[0])
                --high;
            array[low]=array[high];
            while (low < high && array[low] < array[0])
                ++low;
            array[high]=array[low];
        }
        array[low]=array[0];
        return low;
    }
}
