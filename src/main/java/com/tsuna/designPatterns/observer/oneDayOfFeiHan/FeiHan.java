package com.tsuna.designPatterns.observer.oneDayOfFeiHan;

import java.util.ArrayList;
import java.util.List;

public class FeiHan implements Observable {

    private List<Observer> observers=new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public String notifyObserver(String context) {
        StringBuilder messageBuilder=new StringBuilder();
        for(Observer observer:observers){
            messageBuilder.append(observer.update(context));
        }
        return messageBuilder.toString();
    }

    String drinkAlcoholic(){
        String message="One day,Fei Han drinks some alcoholic...\n";
        message+=notifyObserver("Fei Han drinks some alcoholic,");
        return message;
    }
}
