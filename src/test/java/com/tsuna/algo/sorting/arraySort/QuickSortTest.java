package com.tsuna.algo.sorting.arraySort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest extends ArraySortTestBase {
    public void instantiateContext() {
        context=new Context(new QuickSort());
    }
}