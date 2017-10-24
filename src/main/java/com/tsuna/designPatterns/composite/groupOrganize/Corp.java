package com.tsuna.designPatterns.composite.groupOrganize;

abstract class Corp {
    private String name;
    private String position;
    private int salary;
    Corp(String name,String position,int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
    }
    String getInfo(){
        String info="";
        info+="name:"+this.name+"\n";
        info+="position:"+this.position+"\n";
        info+="salary:"+salary+"\n";
        return info;
    }
}
