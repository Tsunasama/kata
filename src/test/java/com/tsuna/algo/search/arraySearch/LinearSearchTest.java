package com.tsuna.algo.search.arraySearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {
    @Test
    public void testLinearSearch(){
        int[] array=new int[]{3,2,6,12,64,6};
        Assert.assertEquals(1,LinearSearch.findEle(array,2));
        Assert.assertEquals(4,LinearSearch.findEle(array,64));
        Assert.assertEquals(0,LinearSearch.findEle(array,3));
        Assert.assertEquals(-1,LinearSearch.findEle(array,1));
    }
}