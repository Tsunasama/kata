package com.tsuna.algo.search.arraySearch;

class BinarySearch {
    static int binaryRecursiveSearch(int[] array,int target) throws Exception {
        if(!isSorted(array))
            throw  new IllegalArgumentException("Array must have been sorted!");
        return globalBinaryRecursiveSearch(array,0,array.length,target);
    }

    static int binaryIterSearch(int[] array,int terget) throws Exception{
        if(!isSorted(array))
            throw  new IllegalArgumentException("Array must have been sorted!");
        return globalBinaryIterSearch(array,0,array.length,terget);
    }

    private static int globalBinaryRecursiveSearch(int[] array, int low, int high, int target){
        if(low==high){
            if(array[low]==target)
                return low;
            else if(array[low]!=target)
                return -1;
        }
        int mid=(low+high)/2;
        if(array[mid]>target)
            return globalBinaryRecursiveSearch(array,low,mid-1,target);
        else if(array[mid]<target)
            return globalBinaryRecursiveSearch(array,mid+1,high,target);
        else return mid;
    }

    private static int globalBinaryIterSearch(int[] array,int start,int end,int target){
        int low=start;
        int high=end;
        int mid;
        while(low!=high){
            mid=(low+high)/2;
            if(array[mid]>target)
                high=mid-1;
            else if(array[mid]<target)
                low=mid+1;
            else
                return mid;
        }
        if(array[low]==target)
            return low;
        else
            return -1;
    }

    private static boolean isSorted(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])
                return false;
        }
        return true;
    }
}
