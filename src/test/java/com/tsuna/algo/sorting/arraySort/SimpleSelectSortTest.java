package com.tsuna.algo.sorting.arraySort;

import static org.junit.Assert.*;

public class SimpleSelectSortTest extends ArraySortTestBase {
    public void instantiateContext() {
        context=new Context(new SimpleSelectSort());
    }
}