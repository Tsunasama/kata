package com.tsuna.algo.recursion.hanio;

import org.junit.runners.Parameterized;

class Hanio {
    static String solve(int floor,char from,char to,char by){
        if(floor==1)
            return "move from "+from+" to "+to+"\n";
        else {
            String solution="";
            solution+=solve(floor-1,from,by,to);//Move floor-1 layers from 'from' to 'by' by 'to'
            solution+="move from "+from+" to "+to+"\n";//Move bottom one from 'from' to 'to'
            solution+=solve(floor-1,by,to,from);//Move floor-1 layers(the same as above)form 'by' to 'to' by 'from'
            return solution;
        }
    }
}
