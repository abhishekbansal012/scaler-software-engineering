package org.pixlaunch.module_06.day_55.assignment.ques_02;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Long, Integer> prefixSumIndex = new HashMap<>();
        int maxLength = 0;
        long prefixSum = 0;

        for (int i = 0; i < A.size(); i++) {
            prefixSum += A.get(i);

            // If prefix sum is 0, update max length
            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            // If prefix sum has been seen before, update max length
            if (prefixSumIndex.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixSumIndex.get(prefixSum));
            } else {
                // Store first occurrence of prefix sum
                prefixSumIndex.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}
