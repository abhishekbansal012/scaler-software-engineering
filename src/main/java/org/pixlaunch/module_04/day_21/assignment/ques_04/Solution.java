package org.pixlaunch.module_04.day_21.assignment.ques_04;

public class Solution {

    public int solve(int A, int B) {
        A = A ^ (1<<B);
        return A;
    }

}
