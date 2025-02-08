package org.pixlaunch.module_04.day_28.assignment.ques_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public int solve(ArrayList<Integer> A) {
        int longestSumZero = 0;
        HashMap<Long, Integer> hashMap = new HashMap<>();

        long prefixSum = 0;

        for (int i = 0; i < A.size(); i++) {
            prefixSum += A.get(i);

            if (prefixSum == 0) {
                longestSumZero = i + 1; // Entire subarray [0, i] has sum zero
            }

            if (hashMap.containsKey(prefixSum)) {
                longestSumZero = Math.max(longestSumZero, i - hashMap.get(prefixSum));
            } else {
                hashMap.put(prefixSum, i);
            }
        }

        return longestSumZero;
    }
}
