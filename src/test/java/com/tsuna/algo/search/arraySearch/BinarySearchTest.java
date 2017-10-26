package com.tsuna.algo.search.arraySearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinaryRecursiveSearch() throws Exception{
        int[] sortedArray=new int[]{3,7,8,23,65,71,98,103,145,150,1023};
        Assert.assertEquals(BinarySearch.binaryRecursiveSearch(sortedArray,23),3);
        Assert.assertEquals(BinarySearch.binaryRecursiveSearch(sortedArray,3),0);
        Assert.assertEquals(BinarySearch.binaryRecursiveSearch(sortedArray,1023),10);
        Assert.assertEquals(BinarySearch.binaryRecursiveSearch(sortedArray,34),-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void binaryRecursiveSearchIllegalArgumentTest() throws Exception{
        int[] unsortedArray=new int[]{1,2,3,4,5,4,6,7};
        BinarySearch.binaryRecursiveSearch(unsortedArray,5);
    }

    @Test
    public void testBinaryIterSearch() throws Exception{
        int[] sortedArray=new int[]{3,7,8,23,65,71,98,103,145,150,1023};
        Assert.assertEquals(BinarySearch.binaryIterSearch(sortedArray,23),3);
        Assert.assertEquals(BinarySearch.binaryIterSearch(sortedArray,3),0);
        Assert.assertEquals(BinarySearch.binaryIterSearch(sortedArray,1023),10);
        Assert.assertEquals(BinarySearch.binaryIterSearch(sortedArray,34),-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void binaryIterSearchIllegalArgumentTest() throws Exception{
        int[] unsortedArray=new int[]{1,2,3,4,3,5,6};
        BinarySearch.binaryIterSearch(unsortedArray,4);
    }
}