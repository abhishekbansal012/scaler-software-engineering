package org.pixlaunch.module_05.day_38.assignment.ques_02;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        //A = 4, 5, 2, 10, 8
        for(int i=0;i<A.size();i++) {

            while (!stack.isEmpty() && stack.peek() >=A.get(i)) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                ans.add(stack.peek());
            }else {
                ans.add(-1);
            }

            stack.push(A.get(i));
        }
        return ans;
    }

}
