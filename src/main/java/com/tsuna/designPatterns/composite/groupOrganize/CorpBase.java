package com.tsuna.designPatterns.composite.groupOrganize;

import com.tsuna.designPatterns.composite.groupOrganize.pojo.Info;

abstract class CorpBase {
    abstract CorpBase findMember(String name);
    private Info info;

    CorpBase(String name, String position, int salary){
        Info info=new Info();
        info.setName(name);
        info.setPosition(position);
        info.setSalary(salary);
        this.info=info;
    }

    Info getInfo(){
        return info;
    }

    String getInfoWords(){
        return info.toString();
    }
}
