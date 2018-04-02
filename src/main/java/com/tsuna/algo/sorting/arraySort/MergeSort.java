package com.tsuna.algo.sorting.arraySort;

import java.security.spec.InvalidParameterSpecException;

public class MergeSort implements IArraySortStrategy {
    /**
     * It makes the array sorted of the {@param count} numbers element.
     * By default,{@code array[0]} is not in the element collection,and it will not be sorted
     *
     * @param array is the set of intergers to be sorted
     * @param count is the number of elements to be sorted
     * @throws InvalidParameterSpecException indicate the count number is larger than array's element count
     */
    public void sort(int[] array, int count) throws InvalidParameterSpecException {
        if(array.length-1 < count)
            throw  new InvalidParameterSpecException("Parameter wrong!");
        int[] temp=new int[count];
        mergeSort(array,1,count,temp);
    }

    /**
     * Sort the array with prescribed indexes
     *
     * @param array origin container
     * @param left  left point(index)
     * @param right right point(index)
     * @param temp  temporary container
     */
    private void mergeSort(int[] array, int left, int right, int[] temp) {
        if(left<right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, temp);//make left segment sorted
            mergeSort(array, mid + 1, right, temp);//make right segment sorted
            merge(array, left, mid, right, temp);//merge two segment
        }
    }

    /**
     *  Merge two sorted subsequence into one.
     *  The first sorted sequence is {@code array[left]} to {@code array[mid]}
     *  The second sorted sequence is {@code array[mid+1]} to {@code array[right]}
     * @param array origin container
     * @param left array's left point
     * @param mid array's mid point
     * @param right array's right point
     * @param temp as a temporary container to save intermediate results
     */
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
