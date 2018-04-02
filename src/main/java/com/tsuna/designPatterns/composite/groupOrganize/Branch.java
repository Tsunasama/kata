package com.tsuna.designPatterns.composite.groupOrganize;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents nodes in the middle of the tree
 */
public class Branch extends CorpBase implements IBranch {
    //store all the sub nodes here
    private List<CorpBase> subordinateList = new ArrayList<>();

    CorpBase findMember(String name) {
        if (getInfo().getName().equalsIgnoreCase(name))
            return this;
        for (CorpBase member : this.subordinateList) {
            CorpBase corpBase = member.findMember(name);
            if (corpBase != null)
                return corpBase;
        }
        return null;
    }

    Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    public String travers() {
        String myInfo = getInfoWords();
        StringBuilder yourInfo = new StringBuilder();
        for (CorpBase c : subordinateList) {
            if (c instanceof Leaf)
                yourInfo.append(c.getInfoWords());
            else if (c instanceof IBranch)
                yourInfo.append(((IBranch) c).travers());
        }
        return myInfo + yourInfo.toString();
    }

    @Override
    public void addSubordinate(CorpBase node) {
        subordinateList.add(node);
    }

    @Override
    public void deleteSubordinate(CorpBase node) {
        subordinateList.remove(node);
    }


}
