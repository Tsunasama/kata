package com.tsuna.designPatterns.observer.oneDayOfFeiHan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObserversTest {
    private FeiHan feiHan;
    private LiangZhang liangZhang;
    private SiLi siLi;
    @Before
    public void instanciate(){
        feiHan=new FeiHan();
        liangZhang=new LiangZhang();
        siLi=new SiLi();
    }
    @Test
    public void ObserverAddTest(){
        feiHan.addObserver(liangZhang);
        feiHan.addObserver(siLi);
        String events=feiHan.drinkAlcoholic();
        String logs="One day,Fei Han drinks some alcoholic...\n" +
                "Liang Zhang heard that Fei Han drinks some alcoholic,,then he go to Fei Han.\n" +
                "Si Li heared that Fei Han drinks some alcoholic,and then he go to QinShiHuang.\n";
        Assert.assertEquals(events,logs);
    }

    @Test
    public void ObserverDeleteTest(){
        feiHan.addObserver(siLi);
        feiHan.addObserver(liangZhang);
        feiHan.deleteObserver(siLi);
        String events=feiHan.drinkAlcoholic();
        String logs="One day,Fei Han drinks some alcoholic...\n" +
                "Liang Zhang heard that Fei Han drinks some alcoholic,,then he go to Fei Han.\n";
        Assert.assertEquals(events,logs);
    }
}
