package com.tsuna.designPatterns.facade.chiefWork;

public class Chief implements IChief {

    private Buyer buyer=new Buyer();
    private Apprentice apprentice=new Apprentice();

    public String makeSalad() {
        StringBuilder makeSalad=new StringBuilder();
        makeSalad.append(buyer.buyMaterial());
        makeSalad.append(apprentice.cutMaterial());
        makeSalad.append(apprentice.relishMaterial());
        makeSalad.append(apprentice.stirAndMixMaterial());
        return makeSalad.toString();
    }

    public String makeRoasetdBeef() {
        StringBuilder roastBeef=new StringBuilder();
        roastBeef.append(buyer.buyMaterial());
        roastBeef.append(apprentice.cutMaterial());
        roastBeef.append(apprentice.roastMaterial());
        roastBeef.append(apprentice.relishMaterial());
        return roastBeef.toString();
    }
}
