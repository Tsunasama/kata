package com.tsuna.designPatterns.strategy.sanguoKill.strategies;

public class Shan implements IStrategy {
    public String operate() {
        return "闪！";
    }

    public String effectiveReply() {
        return "非先手策略！";
    }
}
