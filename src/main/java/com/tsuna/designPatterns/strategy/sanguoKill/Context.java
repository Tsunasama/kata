package com.tsuna.designPatterns.strategy.sanguoKill;

import com.tsuna.designPatterns.strategy.sanguoKill.strategies.*;

public class Context {
    private IStrategy strategy;
    Context(IStrategy attack){
        if(attack.getClass().equals(Sha.class)){
            strategy=new Shan();
        }
        if(attack.getClass().equals(NanMan.class)){
            strategy=new Sha();
        }
        if(attack.getClass().equals(Chai.class)){
            strategy=new WuXie();
        }
        if(attack.getClass().equals(ShunQian.class)){
            strategy=new WuXie();
        }
        if(attack.getClass().equals(WuXie.class)){
            strategy=new WuXie();
        }
        if(attack.getClass().equals(Shan.class)){
            strategy=new Wrong();
        }
    }
    public String operate(){
        return strategy.operate();
    }
}
