package com.tsuna.designPatterns.composite.groupOrganize;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp implements IBranch {
    private List<Corp> subordinateList=new ArrayList<Corp>();
    Branch(String name, String position, int salary) {
        super(name, position, salary);
    }
    void addSubordinate(Corp role){
        subordinateList.add(role);
    }
    public String travers() {
        String myInfo=getInfo();
        String yourInfo="";
        for(Corp c : subordinateList){
            if(c instanceof Leaf)
                yourInfo += c.getInfo();
            else
                yourInfo += ((IBranch) c).travers();
        }
        return myInfo+yourInfo;
    }
}
