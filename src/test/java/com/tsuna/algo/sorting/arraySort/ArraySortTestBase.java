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
        int[] array1 = new int[]{0, 5, 23, 123, 54, 65, 45, 23, 65};
        int[] array2 = new int[]{0,1,2,3,4,5,6,7,8,9,10};
        int[] array3 = new int[]{0,10,9,8,7,6,5,4,3,2,1};
        context.sort(array, array.length - 1);
        context.sort(array1, array1.length - 1);
        context.sort(array2,array2.length-1);
        context.sort(array3,array3.length-1);
        arraySequenceTest(array);
        arraySequenceTest(array1);
        arraySequenceTest(array2);
        arraySequenceTest(array3);
    }

    private void arraySequenceTest(int[] array){
        for(int i=1;i<array.length-1;i++){
            Assert.assertTrue(array[i]<=array[i+1]);
        }
    }
}
