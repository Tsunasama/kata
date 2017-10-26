package com.tsuna.designPatterns.composite.groupOrganize.pojo;

public class Info {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String info="";
        info+="name:"+getName()+"\n";
        info+="position:"+getPosition()+"\n";
        info+="salary:"+getSalary()+"\n";
        return info;
    }

    private String position;
    private int salary;
}
