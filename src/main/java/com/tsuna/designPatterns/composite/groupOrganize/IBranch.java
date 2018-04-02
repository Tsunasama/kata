package com.tsuna.designPatterns.composite.groupOrganize;

public interface IBranch {
    /**
     * Travers the information of self node and sub nodes
     *
     * @return the infomation as {@code Stringg}
     */
    String travers();

    /**
     * Add sub node of current node.
     * In reality,it means add subordinates to your self
     *
     * @param node a node object(An employee in reality)
     */
    void addSubordinate(CorpBase node);

    /**
     * Find and delete a sub node indicated.
     * In reality,it means a subordinate moved from your department
     * @param node a node object(An employee in reality)
     */
    void deleteSubordinate(CorpBase node);
}
