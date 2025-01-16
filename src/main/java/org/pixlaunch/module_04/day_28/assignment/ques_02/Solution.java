package org.pixlaunch.module_04.day_28.assignment.ques_02;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {
        // Use a HashMap to store the frequency of elements in the array
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : A) {
            // Check if the required number exists and update the count
            count += frequencyMap.getOrDefault(num - B, 0);
            count += frequencyMap.getOrDefault(num + B, 0);

            // Update the frequency of the current number
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;

    }

}
