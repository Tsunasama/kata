package com.tsuna.designPatterns.composite.groupOrganize;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BranchTest {
    private Branch ceo;
    private Branch devDirector;
    private Branch saleDirector;
    private Leaf secretary;
    private Branch finanDirector;
    private Branch devGroupHeader1;
    private Branch devGroupHeader2;
    private Leaf saleMan1;
    private Leaf saleMan2;
    private Leaf financialRole;
    private Leaf developer1;
    private Leaf developer2;
    private Leaf developer3;
    private Leaf developer4;

    @Before
    public void instantiate(){
        instantiateMembers();
        buildDevDepart();
        buildFinanDepart();
        buildSaleDepart();
        buildHeadQuaters();
    }

    @Test
    public void testTotalTraverse() {
        Assert.assertEquals(getTotalInfo(),ceo.travers());
    }
    @Test
    public void testDevDepartTraverse() {
        Assert.assertEquals(getDevDepartInfo(),devDirector.travers());
    }
    @Test
    public void testSalesDepartTraverse() {
        Assert.assertEquals(getSaleDepartInfo(),saleDirector.travers());
    }
    @Test
    public void testFinanDepartTraverse(){
        Assert.assertEquals(getFinianDepartInfo(),finanDirector.travers());
    }
    @Test
    public void testFindMember(){
        Assert.assertSame(developer4,ceo.findMember("Mike"));
        Assert.assertSame(ceo,ceo.findMember("Tom"));
        Assert.assertSame(secretary,ceo.findMember("Marry"));
        Assert.assertEquals(null,ceo.findMember("Jay"));
        Assert.assertSame(developer1,devGroupHeader1.findMember("Tim"));
        Assert.assertSame(saleMan1,saleDirector.findMember("Sherry"));
        Assert.assertEquals(null,devDirector.findMember("Sherry"));
    }
    @Test
    public void testDeleteSubordinate(){
        ceo.deleteSubordinate(finanDirector);
        Assert.assertEquals(getFinanDeletedCircum(),ceo.travers());
    }

    private void instantiateMembers(){
        ceo=new Branch("Tom","CEO",20000);
        devDirector=new Branch("Jerry","develop director",15000);
        saleDirector=new Branch("John","sales director",15000);
        secretary=new Leaf("Marry","secretary",12000);
        finanDirector=new Branch("Bob","finance directory",13000);
        devGroupHeader1=new Branch("Tony","develop group1's header",12000);
        devGroupHeader2=new Branch("Julia","develop group2's header",12000);
        saleMan1=new Leaf("Sherry","sales man",8000);
        saleMan2=new Leaf("Jimmy","sales man",8000);
        financialRole =new Leaf("Kerry","finiancial role",7000);
        developer1=new Leaf("Tim","developer",10000);
        developer2=new Leaf("Emily","developer",10000);
        developer3=new Leaf("Una","developer",10000);
        developer4=new Leaf("Mike","develoer",10000);
    }

    private void buildDevDepart(){
        //Depart1
        devGroupHeader1.addSubordinate(developer1);
        devGroupHeader1.addSubordinate(developer3);
        devDirector.addSubordinate(devGroupHeader1);
        //Depart2
        devGroupHeader2.addSubordinate(developer2);
        devGroupHeader2.addSubordinate(developer4);
        devDirector.addSubordinate(devGroupHeader2);
    }

    private String getDevDepartInfo(){
        String info="";
        info+=devDirector.getInfoWords();
        info+=devGroupHeader1.getInfoWords();
        info+=developer1.getInfoWords();
        info+=developer3.getInfoWords();
        info+=devGroupHeader2.getInfoWords();
        info+=developer2.getInfoWords();
        info+=developer4.getInfoWords();
        return info;
    }

    private void buildSaleDepart(){
        saleDirector.addSubordinate(saleMan1);
        saleDirector.addSubordinate(saleMan2);
    }

    private String getSaleDepartInfo(){
        String info="";
        info+=saleDirector.getInfoWords();
        info+=saleMan1.getInfoWords();
        info+=saleMan2.getInfoWords();
        return info;
    }

    private void buildFinanDepart(){
        finanDirector.addSubordinate(financialRole);
    }

    private String getFinianDepartInfo(){
        String info="";
        info+=finanDirector.getInfoWords();
        info+= financialRole.getInfoWords();
        return info;
    }

    private void buildHeadQuaters(){
        ceo.addSubordinate(devDirector);
        ceo.addSubordinate(saleDirector);
        ceo.addSubordinate(finanDirector);
        ceo.addSubordinate(secretary);
    }

    private String getTotalInfo(){
        String info="";
        info+=ceo.getInfoWords();
        info+=getDevDepartInfo();
        info+=getSaleDepartInfo();
        info+=getFinianDepartInfo();
        info+=secretary.getInfoWords();
        return info;
    }

    private String getFinanDeletedCircum(){
        String info="";
        info+=ceo.getInfoWords();
        info+=getDevDepartInfo();
        info+=getSaleDepartInfo();
        info+=secretary.getInfoWords();
        return info;
    }
}