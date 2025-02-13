package org.pixlaunch.module_05.day_38.assignment.ques_01;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public int evalRPN(ArrayList<String> tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop(); // Second operand
                int a = stack.pop(); // First operand
                stack.push(applyOperator(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // Assumes b is non-zero
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

}
