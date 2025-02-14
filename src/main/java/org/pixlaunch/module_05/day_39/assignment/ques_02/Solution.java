package org.pixlaunch.module_05.day_39.assignment.ques_02;

import java.util.Stack;

public class Solution {

    public String solve(String A) {

        Stack<Character> stack = new Stack<>();
        if(A.isEmpty()) {
            return A;
        }
        stack.push(A.charAt(0));

        for(int i=1;i<A.length();i++) {
            if(!stack.isEmpty() && stack.peek().equals(A.charAt(i))) {
                stack.pop();
            }else {
                stack.push(A.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }

}
