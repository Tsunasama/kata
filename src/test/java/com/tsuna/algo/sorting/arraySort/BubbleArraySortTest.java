package com.tsuna.algo.sorting.arraySort;

public class BubbleArraySortTest extends ArraySortTestBase {
    @Override
    public void instantiateContext() {
        context=new Context(new BubbleSort());
    }
}