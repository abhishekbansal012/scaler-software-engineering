package org.pixlaunch.module_02.day_09.additional_problems.ques_02;

import java.util.ArrayList;
import java.util.Objects;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {

        return findMinAverageSubarray(A, B);
    }

    private int findMinAverageSubarray(ArrayList<Integer> arr, int sizeOfSubArray) {

        if (Objects.isNull(arr)|| arr.isEmpty() || sizeOfSubArray <= 0 || sizeOfSubArray> arr.size()) {
            return 0; // return an empty array for invalid input
        }

        int n = arr.size();
        int minSum;
        int currentSum = 0;
        int startIndex = 0;

        // Calculate the sum of the first 'B' elements
        for (int i = 0; i < sizeOfSubArray; i++) {
            currentSum += arr.get(i);
        }
        minSum = currentSum;

        // Use sliding window to find the minimum sum of subarrays of size B
        for (int i = sizeOfSubArray; i < n; i++) {
            currentSum += arr.get(i) - arr.get(i-sizeOfSubArray); // Slide the window
            if (currentSum < minSum) {
                minSum = currentSum;
                startIndex = i - sizeOfSubArray + 1; // Update the start index of the minimum subarray
            }
        }

        // Prepare the result subarray
        int[] result = new int[sizeOfSubArray];
        for (int i = 0; i < sizeOfSubArray; i++) {
            result[i] = arr.get(startIndex + i);
        }

        return startIndex;
    }
}
