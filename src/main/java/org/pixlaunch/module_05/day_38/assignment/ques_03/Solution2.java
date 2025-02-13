package org.pixlaunch.module_05.day_38.assignment.ques_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution2 {
    public int solve(String A) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');

        for (char c : A.toCharArray()) {
            if (bracketPairs.containsKey(c)) { // If it's a closing bracket
                if (stack.isEmpty() || stack.pop() != bracketPairs.get(c)) {
                    return 0; // Mismatch found
                }
            } else {
                stack.push(c); // Push opening brackets
            }
        }
        return stack.isEmpty() ? 1 : 0; // Stack should be empty if balanced
    }
}
