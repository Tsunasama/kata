package com.tsuna.designPatterns.memento.general;

public class Memento {
    //Reserve the status of originator
    private String status;

    Memento(String status){
        this.status=status;
    }

    public String getStatus() {
        return status;
    }


}
