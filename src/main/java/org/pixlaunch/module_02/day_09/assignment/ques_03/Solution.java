package org.pixlaunch.module_02.day_09.assignment.ques_03;

import java.util.ArrayList;

public class Solution {

    public int solve(ArrayList<Integer> A, int B, int C) {
        //Given an array A of length N. Also given are integers B and C.
        //Return 1 if there exists a sub array with length B having sum C and 0 otherwise
        int N = A.size();

        // Edge case: if B is greater than the length of the array
        if (B > N) {
            return 0;
        }

        // Calculate the sum of the first 'B' elements
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A.get(i);
        }

        // Check if the first window's sum equals C
        if (currentSum == C) {
            return 1;
        }

        // Slide the window over the rest of the array
        for (int i = B; i < N; i++) {
            // Subtract the element going out of the window and add the new element
            currentSum += A.get(i) - A.get(i-B);

            // Check if the current sum equals C
            if (currentSum == C) {
                return 1;
            }
        }

        // If no subarray with the required sum is found
        return 0;
    }

}
