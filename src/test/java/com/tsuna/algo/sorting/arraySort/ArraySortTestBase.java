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
        int[] array=new int[]{0,1,2,3};
        context.sort(array,4);
    }

    @Test
    public void testArraySort(){
        int[] array = new int[]{0,7,4,9,84,10,39,7};
        int[] array1 = new int[]{0,5,23,123,54,65,45,23,65};
        try{
            context.sort(array,array.length-1);
            context.sort(array1,array1.length-1);
            for(int i=1;i<array.length-1;i++){
                Assert.assertTrue(array[i]<=array[i+1]);
            }
            for(int i=1;i<array1.length-1;i++){
                Assert.assertTrue(array1[i]<=array1[i+1]);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
