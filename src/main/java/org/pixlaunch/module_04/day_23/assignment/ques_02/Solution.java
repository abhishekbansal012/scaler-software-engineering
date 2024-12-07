package org.pixlaunch.module_04.day_23.assignment.ques_02;

import java.util.List;

public class Solution {

    public int solve(int A) {
        return findFactorial(A);
    }

    private int findFactorial(int A) {

        // Base case: factorial of 0 or 1 is 1
        if (A == 0 || A == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return A * findFactorial(A - 1);


    }


}
