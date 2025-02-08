package org.pixlaunch.module_04.day_28.assignment.ques_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0, count = 0;

        // Initialize the hashmap with (0,1) to count subarrays starting from index 0
        prefixSumMap.put(0, 1);

        for (int num : A) {
            prefixSum += num;

            // Check if there exists a subarray whose sum equals B
            if (prefixSumMap.containsKey(prefixSum - B)) {
                count += prefixSumMap.get(prefixSum - B);
            }

            // Store the prefix sum frequency
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
