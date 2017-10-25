package com.tsuna.algo.recursion.hanio;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HanioTest {
    @Test
    public void hanio3LayerSolutionTest(){
        String hanio3LayerSolution="move from a to c\n" +
                "move from a to b\n" +
                "move from c to b\n" +
                "move from a to c\n" +
                "move from b to a\n" +
                "move from b to c\n" +
                "move from a to c\n";
        Assert.assertEquals(Hanio.solve(3,'a','c','b'),hanio3LayerSolution);
    }

    @Test
    public void hanio4LayerSolutionTest(){
        String hanio4LayerSolution="move from a to b\n" +
                "move from a to c\n" +
                "move from b to c\n" +
                "move from a to b\n" +
                "move from c to a\n" +
                "move from c to b\n" +
                "move from a to b\n" +
                "move from a to c\n" +
                "move from b to c\n" +
                "move from b to a\n" +
                "move from c to a\n" +
                "move from b to c\n" +
                "move from a to b\n" +
                "move from a to c\n" +
                "move from b to c\n";
        Assert.assertEquals(Hanio.solve(4,'a','c','b'),hanio4LayerSolution);
    }
}