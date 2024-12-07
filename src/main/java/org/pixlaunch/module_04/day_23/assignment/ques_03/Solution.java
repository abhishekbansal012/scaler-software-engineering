package org.pixlaunch.module_04.day_23.assignment.ques_03;

public class Solution {

    public int findAthFibonacci(int A) {
        return fibonacci(A);
    }

    private int fibonacci(int n) {
        // Base cases: F(0) = 0 and F(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive case: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }


    }


}
