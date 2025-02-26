package org.pixlaunch.module_06.day_55.assignment.ques_01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int longestConsecutive(final List<Integer> A) {

        if (A == null || A.isEmpty()) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>(A);
        int longestStreak = 0;

        for (int num : numSet) {
            // Check if this number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
