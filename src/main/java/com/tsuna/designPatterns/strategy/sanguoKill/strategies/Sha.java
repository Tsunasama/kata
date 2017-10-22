package com.tsuna.designPatterns.strategy.sanguoKill.strategies;

public class Sha implements IStrategy {
    public String operate() {
        return "杀！";
    }

    public String effectiveReply() {
        return "闪！";
    }
}
