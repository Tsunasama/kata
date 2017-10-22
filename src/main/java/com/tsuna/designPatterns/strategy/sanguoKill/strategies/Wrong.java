package com.tsuna.designPatterns.strategy.sanguoKill.strategies;

public class Wrong implements IStrategy {
    public String operate() {
        return "非先手策略！";
    }

    public String effectiveReply() {
        return "";
    }
}
