package com.tsuna.designPatterns.composite.groupOrganize;

class Leaf extends CorpBase implements ILeaf {
    @Override
    CorpBase findMember(String name) {
        if(name.equalsIgnoreCase(this.getInfo().getName()))
            return this;
        return null;
    }

    Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}
