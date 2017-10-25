package com.tsuna.designPatterns.observer.oneDayOfFeiHan;

public class LiangZhang implements Observer {
    public String update(String context) {
        return "Liang Zhang heard that "+context+",then he go to Fei Han.\n";
    }
}
