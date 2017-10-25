package com.tsuna.designPatterns.observer.oneDayOfFeiHan;

public class SiLi implements Observer {
    public String update(String context) {
        return "Si Li heared that "+context+"and then he go to QinShiHuang.\n";
    }
}
