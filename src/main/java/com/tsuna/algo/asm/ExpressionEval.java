package com.tsuna.algo.asm;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class ExpressionEval {
    private static final Map<Character, Integer> priorities = new HashMap<Character, Integer>() {
        {
            put('+', 5);
            put('-', 5);
            put('*', 10);
            put('/', 10);
            put(')', 20);
        }
    };

    public static void main(String[] args) {
        ExpressionEval sol = new ExpressionEval();
        System.out.println(sol.calculate("2* (5-1) *(3+2)"));
    }

    public int calculate(String s) {
        Deque<Character> ops = new ArrayDeque();
        Deque<Integer> nums = new ArrayDeque();
        nums.push(0); // 用来应对第一个算数为负数情况
        int i = 0;
        s = s.replaceAll(" ", "");
        char[] sChars = s.toCharArray();
        while (i < sChars.length) {
            if (sChars[i] == ' ') {
                i++;
            } else if (sChars[i] == '(') {
                ops.push('(');
                i++;
            } else if (sChars[i] == ')') {
                i++;

                while (ops.peek() != '(') {
                    calcLast(nums, ops);
                }

                ops.pop();
            } else if (Character.isDigit(sChars[i])) {
                int numTmp = 0;
                while (i < sChars.length && Character.isDigit(sChars[i])) {
                    numTmp = numTmp * 10 + sChars[i] - '0';
                    i++;
                }

                nums.push(numTmp);
            } else if (sChars[i] == '+' || sChars[i] == '-' || sChars[i] == '*' || sChars[i] == '/') {
                if (ops.isEmpty()) {
                    ops.push(sChars[i]);
                    i++;
                    continue;
                }

                // 用来处理负数情况如： (-2+3) --3
                if (i > 0 && (sChars[i - 1] == '(' || sChars[i - 1] == '+' || sChars[i - 1] == '-')) {
                    nums.push(0);
                }

                while (!ops.isEmpty() && ops.peek() != '(' && priorityCheck(ops.peek(), sChars[i])) {
                    calcLast(nums, ops);
                }

                ops.push(sChars[i]);
                i++;
            }
        }

        while (!ops.isEmpty()) {
            calcLast(nums, ops);
        }

        return nums.peek();
    }

    private void calcLast(Deque<Integer> nums, Deque<Character> ops) {
        int numB = nums.pop();
        int numA = nums.pop();
        char op = ops.pop();

        int result;
        switch (op) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                throw new NotImplementedException();
        }
        nums.push(result);
    }

    private boolean priorityCheck(char prev, char current) {
        return priorities.get(prev) >= priorities.get(current);
    }

}
