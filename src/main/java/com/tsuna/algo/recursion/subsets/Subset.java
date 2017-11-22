/*
 * Copyright (c) 2017.
 * Project : kata
 * File : Subset.java
 * Date : 17-11-21 下午4:51
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.recursion.subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Subset {
    static List<List<Integer>> subsets(List<Integer> list) {
        if (list.isEmpty()) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Collections.emptyList());
            return result;
        }
        Integer first = list.get(0);
        List sublist = list.subList(1, list.size());
        List<List<Integer>> origin = subsets(sublist);
        List<List<Integer>> newCreated = insertAll(first, origin);
        return merge(origin, newCreated);
    }

    /**
     * Make two sets to one set
     *
     * @param origin:origin set
     * @param newSet:to     be inserted set
     * @return :merged set
     */
    private static List<List<Integer>> merge(List<List<Integer>> origin, List<List<Integer>> newSet) {
        List<List<Integer>> result = new ArrayList<>(origin);
        result.addAll(newSet);
        return result;
    }

    /**
     * Insert first into other lists to make different lists
     *
     * @param first : Integer to be inserted
     * @param set1  : several lists
     * @return : updated lists
     */
    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> set1) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> each : set1) {
            List<Integer> copy = new ArrayList<>();
            copy.add(first);
            copy.addAll(each);
            result.add(copy);
        }
        return result;
    }
}
