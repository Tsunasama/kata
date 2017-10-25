package com.tsuna.designPatterns.observer.oneDayOfFeiHan;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    String notifyObserver(String context);
}
