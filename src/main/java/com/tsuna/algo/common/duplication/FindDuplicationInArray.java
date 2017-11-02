/*
 * Copyright (c) 2017.
 * Project : kata
 * File : findDuplacationInArray.java
 * Date : 17-11-2 上午9:48
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.duplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *  In an array of which length equals to n and all number between 0~n-1.
 *  Some number may be duplication.
 *  To find them.
 */
class FindDuplicationInArray {
    static List<Integer> findDuplacate(int[] array){
        if(array==null)
            throw new IllegalArgumentException("Argument cannot be null");
        for(int i:array){
            if(array[i]>=array.length)
                throw new IllegalArgumentException("Argument must be an array with its element below its length");
        }
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]!=i)
                while (array[i]!=i){
                    if(array[i]==array[array[i]]) {
                        result.add(array[i]);//record duplication
                        break;
                    }
                    exchange(array,i,array[i]);
                }
        }
        return reorganize(result);
    }
    private static void exchange(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    //clear up the duplication of result,and sort them
    private static List<Integer> reorganize(List<Integer> result){
        List<Integer> outcome=new ArrayList<>();
        result.sort(Comparator.comparingInt(o -> o));
        if(!result.isEmpty()){
            outcome.add(result.get(0));
            for(int i=1;i<result.size();i++){
                if(!result.get(i).equals(result.get(i-1)))
                    outcome.add(result.get(i));
            }
        }
        return outcome;
    }
}
