package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class QuickSort implements IArraySortStrategy {
    /**
     * It checks arguments and sorted the array
     * Note: the first element of arry({@code array[0]} is not sorted,sorted collection index from 1
     *
     * @param array the origin container
     * @param count the number of elements to be sorted
     * @throws InvalidParameterSpecException indicates there is something wrong within the parameter
     */
    public void sort(int[] array, int count) throws InvalidParameterSpecException {
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
