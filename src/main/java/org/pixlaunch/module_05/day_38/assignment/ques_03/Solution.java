package org.pixlaunch.module_05.day_38.assignment.ques_03;

import java.util.Stack;

public class Solution {

    public int solve(String A) {
        Stack<String> stack = new Stack<>();
        int ans = 1;
        if(!A.isEmpty()) {
            stack.push(A.charAt(0)+"");
        }
        for(int i = 1;i<A.length();i++) {
            if(isClosingLastParentheses(A.charAt(i))) {
                String currentParentheses = String.valueOf(A.charAt(i));
                String lastParentheses = stack.pop();
                
                if(!findMatchingOpeningParentheses(currentParentheses).equals(lastParentheses)) {
                    ans = 0;
                    break;
                }
            } else {
                stack.push(A.charAt(i)+"");
            }
        }
        if(stack.isEmpty() && ans==1) {
            return 1;
        }
        return 0;

    }

    private String findMatchingOpeningParentheses(String currentParentheses) {
        switch (currentParentheses) {
            case "}": return "{";
            case ")": return "(";
            case "]": return "[";
            default: throw new IllegalArgumentException("Invalid operator: " + currentParentheses);
        }
    }

    private boolean isClosingLastParentheses(char c) {
        return c == '}' || c == ')' || c == ']';
    }
}
