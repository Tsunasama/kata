package com.tsuna.designPatterns.composite.groupOrganize;

public interface IBranch {
    String travers();
    void addSubordinate(CorpBase node);
    void deleteSubordinate(CorpBase node);
}
