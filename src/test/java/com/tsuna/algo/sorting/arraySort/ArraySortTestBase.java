package com.tsuna.algo.sorting.arraySort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.spec.InvalidParameterSpecException;

public abstract class ArraySortTestBase {
    Context context = null;

    @Before
    public abstract void instantiateContext();

    @Test(expected = InvalidParameterSpecException.class)
    public void testSortParameterWrong() throws Exception {
        int[] array = new int[]{0, 1, 2, 3};
        context.sort(array, 4);
    }

    @Test
    public void testArraySort() throws Exception {
        int[] array = new int[]{0, 7, 4, 9, 84, 10, 39, 7};
        int[] array1 = new int[]{0, 5, 5, 123, 54, 65, 45, 23, 5};
        int[] array2 = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int[] array3 = new int[]{0,10,9,8,7,6,5,4,3,2,1};
        int[] array4 = new int[]{0, 94, 35, 7453, 4, 23, 56, 71, 16, 4, 145, 71, 5, 134, 71, 542,
                13, 74, 345, 68, 45, 17, 38, 41, 57, 38, 26, 28, 54, 19, 45, 0};
        context.sort(array, array.length - 1);
        context.sort(array1, array1.length - 1);
        context.sort(array2,array2.length-1);
        context.sort(array3,array3.length-1);
        context.sort(array4, array4.length - 1);
        arraySequenceTest(array);
        arraySequenceTest(array1);
        arraySequenceTest(array2);
        arraySequenceTest(array3);
        arraySequenceTest(array4);
    }

    private void arraySequenceTest(int[] array){
        for(int i=1;i<array.length-1;i++){
            Assert.assertTrue(array[i]<=array[i+1]);
        }
    }
}
