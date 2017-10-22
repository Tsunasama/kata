package com.tsuna.designPatterns.strategy.sanguoKill.strategies;

public class NanMan implements IStrategy {
    public String operate() {
        return "南蛮入侵！";
    }

    public String effectiveReply() {
        return "杀！";
    }
}
