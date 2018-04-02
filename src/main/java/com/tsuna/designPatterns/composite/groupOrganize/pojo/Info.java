package com.tsuna.designPatterns.composite.groupOrganize.pojo;

/**
 * This class represents the information of an employee
 */
public class Info {
    private String name;
    private String position;
    private int salary;

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

    private int getSalary() {
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

}
