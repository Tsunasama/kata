package com.tsuna.algo.search.arraySearch;

class LinearSearch {
    static int findEle(int[] array,int content){
        int index;
        for(index=0;index<array.length && array[index]!=content ;++index);
        if(index<array.length)
            return index;
        else return -1;
    }
}
