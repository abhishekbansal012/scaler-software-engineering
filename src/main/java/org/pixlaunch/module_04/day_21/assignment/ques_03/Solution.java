package org.pixlaunch.module_04.day_21.assignment.ques_03;

import java.util.List;

public class Solution {

    public int solve(int A, int B) {
        if (checkIfIthBitSet(A,B)) {
            A = A ^ (1<<B);
        }

        return A;
    }

    boolean checkIfIthBitSet(int A, int B) {
        return (A & (1 << B)) != 0;
    }

}
