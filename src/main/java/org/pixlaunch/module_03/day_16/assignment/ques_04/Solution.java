package org.pixlaunch.module_03.day_16.assignment.ques_04;

public class Solution {

    public String solve(String A) {
        StringBuilder result  = new StringBuilder();

        for(int i=A.length()-1;i>=0;i--) {
            result.append(A.charAt(i));
        }
        return result.toString();
    }

}
