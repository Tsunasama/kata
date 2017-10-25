package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class MergeSort implements IArraySortStrategy {
    public void sort(int[] array, int count) throws Exception {
        if(array.length-1 < count)
            throw  new InvalidParameterSpecException("Parameter wrong!");
        int[] temp=new int[count];
        mergeSort(array,1,count,temp);
    }
    private void mergeSort(int[] array,int left,int right,int[] temp){
        if(left<right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, temp);//make left segment sorted
            mergeSort(array, mid + 1, right, temp);//make right segment sorted
            merge(array, left, mid, right, temp);//merge two segment
        }
    }
    //make to sorted segment into one sorted segment
    private void merge(int[] array,int left,int mid,int right,int[] temp){
        int i=left,j=mid+1,t=0;
        while (i<=mid&&j<=right){
            if(array[i]<=array[j])
                temp[t++]=array[i++];
            else
                temp[t++]=array[j++];
        }
        while (i<=mid)
            temp[t++]=array[i++];
        while (j<=right)
            temp[t++]=array[j++];
        t=0;
        while(left<=right){
            array[left++]=temp[t++];
        }
    }
}
