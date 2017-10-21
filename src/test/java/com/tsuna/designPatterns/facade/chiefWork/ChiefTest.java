package com.tsuna.designPatterns.facade.chiefWork;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChiefTest {
    private IChief chief;

    @Before
    public void instantiate(){
        chief=new Chief();
    }


    @Test
    public void testMakeSalad(){
        StringBuilder makeSalad=new StringBuilder();
        makeSalad.append("Buy origin material.");
        makeSalad.append("Cut the material.");
        makeSalad.append("Relish the material.");
        makeSalad.append("Stir and mix the material.");
        String testedSalad=makeSalad.toString();
        String salad=chief.makeSalad();
        Assert.assertEquals(testedSalad,salad);
    }

    @Test
    public void testMakeRoasetedBeef(){
        StringBuilder roastBeef=new StringBuilder();
        roastBeef.append("Buy origin material.");
        roastBeef.append("Cut the material.");
        roastBeef.append("Roast the material.");
        roastBeef.append("Relish the material.");
        String testedBeef=roastBeef.toString();
        String beef=chief.makeRoasetdBeef();
        Assert.assertEquals(testedBeef,beef);
    }
}
