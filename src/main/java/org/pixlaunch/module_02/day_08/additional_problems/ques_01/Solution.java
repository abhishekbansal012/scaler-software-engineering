package org.pixlaunch.module_02.day_08.additional_problems.ques_01;

import java.util.ArrayList;

public class Solution {

    //5,-2,3,1,2
    public int solve(ArrayList<Integer> A, int B) {

        int N = A.size();
        if (B > N) {
            throw new IllegalArgumentException("B cannot be greater than the size of the array.");
        }

        // Precompute the prefix sums from the left
        int[] prefixSum = new int[B + 1];
        prefixSum[0] = 0; // no elements taken from the left
        for (int i = 1; i <= B; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i - 1);
        }

        // Precompute the suffix sums from the right
        int[] suffixSum = new int[B + 1];
        suffixSum[0] = 0; // no elements taken from the right
        for (int i = 1; i <= B; i++) {
            suffixSum[i] = suffixSum[i - 1] + A.get(N - i);
        }

        // Calculate the maximum sum by trying all combinations
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= B; i++) {
            if (i <= N && (B - i) <= N) {
                int currentSum = prefixSum[i] + suffixSum[B - i];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
