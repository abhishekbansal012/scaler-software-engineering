package org.pixlaunch.module_05.day_38.assignment.ques_04;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public int solve(int A, int B, ArrayList<Integer> C) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<A;i++) {
            if(C.get(i)!=0) {
                stack.push(C.get(i));
            }else {
                stack.pop();
            }
        }
        if(stack.isEmpty()) {
            return B;
        }
        return stack.peek();
    }

}
