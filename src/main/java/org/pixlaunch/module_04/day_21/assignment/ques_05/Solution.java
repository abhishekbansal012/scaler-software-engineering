package org.pixlaunch.module_04.day_21.assignment.ques_05;

public class Solution {

    public int solve(int A, int B) {
        if (checkIfIthBitSet(A,B)) {
            return 1;
        }

        return 0;
    }

    boolean checkIfIthBitSet(int A, int B) {
        return (A & (1 << B)) != 0;
    }

}
