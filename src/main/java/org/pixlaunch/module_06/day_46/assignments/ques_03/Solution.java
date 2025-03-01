package org.pixlaunch.module_06.day_46.assignments.ques_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> seen = new HashSet<>();
        int count = 0;

        for (int num : A) {
            int complement = B - num;

            // If complement is already in seen set, we found a valid pair
            if (seen.contains(complement)) {
                count++;
                seen.remove(complement); // Remove to avoid counting duplicate pairs
            } else {
                seen.add(num);
            }
        }
        return count;
    }
}
