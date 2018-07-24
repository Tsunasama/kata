package com.tsuna.designPatterns.memento.general;

import org.apache.tools.ant.taskdefs.condition.Or;

public class Originator {
    //preserve the current status
    private String status;

    public Originator(String status){
        this.status=status;
    }

    public Originator(){
        this.status="default status";
    }

    public void setStatus(String status){
        this.status=status;
    }

    public String getStatus(){
        return this.status;
    }

    public Memento createMemento(){
        return new Memento(status);
    }

    public void restoreMemento(Memento memento){
        setStatus(memento.getStatus());
    }
}
