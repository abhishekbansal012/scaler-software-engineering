package org.pixlaunch.module_02.day_09.additional_problems.ques_01;

import java.util.ArrayList;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {

        return getCountGoodArrays(A, B);
    }

    private int getCountGoodArrays(ArrayList<Integer> arr, int sumOfSubArray) {
        int n = arr.size();
        int count = 0;

        // Iterate over all possible starting points
        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            // Iterate over all possible ending points
            for (int end = start; end < n; end++) {
                currentSum += arr.get(end); // Sum elements from start to end
                int length = end - start + 1; // Length of the subarray

                // Check the conditions for being a good subarray
                if (length % 2 == 0) { // Even length
                    if (currentSum < sumOfSubArray) {
                        count++;
                    }
                } else { // Odd length
                    if (currentSum > sumOfSubArray) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
