package org.pixlaunch.module_02.day_07.assignment.ques_04;

import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int n = A.size();
        if (n == 0) return 0;

        // Step 1: Calculate the total sums of even and odd indexed elements
        int totalEvenSum = 0;
        int totalOddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                totalEvenSum += A.get(i);
            } else {
                totalOddSum += A.get(i);
            }
        }

        // Step 2: Use prefix sums to find valid indices
        int evenPrefixSum = 0;
        int oddPrefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Calculate the current even and odd sums if we remove arr[i]
            if (i % 2 == 0) {
                // arr[i] is even-indexed
                int newEvenSum = evenPrefixSum + (totalOddSum - oddPrefixSum);
                int newOddSum = oddPrefixSum + (totalEvenSum - evenPrefixSum - A.get(i));

                if (newEvenSum == newOddSum) {
                    count++;
                }

                evenPrefixSum += A.get(i);
            } else {
                // arr[i] is odd-indexed
                int newEvenSum = evenPrefixSum + (totalOddSum - oddPrefixSum - A.get(i));
                int newOddSum = oddPrefixSum + (totalEvenSum - evenPrefixSum);

                if (newEvenSum == newOddSum) {
                    count++;
                }

                oddPrefixSum += A.get(i);
            }
        }

        return count;
    }


}
