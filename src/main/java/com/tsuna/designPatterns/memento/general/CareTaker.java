package com.tsuna.designPatterns.memento.general;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
