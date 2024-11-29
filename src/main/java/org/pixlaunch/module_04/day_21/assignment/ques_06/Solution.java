package org.pixlaunch.module_04.day_21.assignment.ques_06;

public class Solution {

    public int solve(int A, int B) {
        int newNumber = 0;
        newNumber = newNumber | (1<<A);
        newNumber = newNumber | (1<<B);
        return newNumber;
    }

}
