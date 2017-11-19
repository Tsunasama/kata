/*
 * Copyright (c) 2017.
 * Project : kata
 * File : PrimeNumbersCollector.java
 * Date : 17-11-18 下午6:15
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.number;

import org.omg.CORBA.portable.IDLEntity;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

public class PrimeNumbersCollector implements Collector<Integer, Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> {
    @Override
    public Supplier<Map<Boolean, List<Integer>>> supplier() {
        return () -> new HashMap<Boolean, List<Integer>>() {{
            put(true, new ArrayList<>());
            put(false, new ArrayList<>());
        }};
    }

    @Override
    public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
        return (acc, candidate) -> acc.get(isPrime(acc.get(true), candidate)).add(candidate);
    }

    @Override
    public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
        return (map1, map2) -> {
            map1.get(true).addAll(map2.get(true));
            map1.get(false).addAll(map2.get(false));
            return map1;
        };
    }

    @Override
    public Function<Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
    }

    private static boolean isPrime(List<Integer> primes, int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return pick(primes, i -> i <= candidateRoot).stream().noneMatch(p -> candidate % p == 0);
    }

    private static <A> List<A> pick(List<A> list, Predicate<A> p) {
        int i = 0;
        for (A item : list) {
            if (!p.test(item))
                return list.subList(0, i);
            i++;
        }
        return list;
    }

    List<Integer> getPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed().collect(new PrimeNumbersCollector()).get(true);
    }
}
