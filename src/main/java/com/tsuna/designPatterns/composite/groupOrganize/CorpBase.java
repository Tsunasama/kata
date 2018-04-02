package com.tsuna.designPatterns.composite.groupOrganize;

import com.tsuna.designPatterns.composite.groupOrganize.pojo.Info;

/**
 * Represents a node in the tree,which is an employee in reality
 */
abstract class CorpBase {
    /**
     * This method is to find between sub nodes and current node of which name is {@code name}
     *
     * @param name represents the name info of an employee
     * @return the employee found which could be found as {@code null} if nothing found
     */
    abstract CorpBase findMember(String name);

    //employee's information
    private Info info;

    CorpBase(String name, String position, int salary){
        Info info=new Info();
        info.setName(name);
        info.setPosition(position);
        info.setSalary(salary);
        this.info=info;
    }

    Info getInfo(){
        return info;
    }

    String getInfoWords(){
        return info.toString();
    }
}
