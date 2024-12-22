package org.pixlaunch.module_04.day_30.assignment.ques_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        // Sort the ArrayList using inline comparator
        A.sort((a, b) -> {
            int factorsA = countFactors(a);
            int factorsB = countFactors(b);

            // Compare by number of factors, then by value
            if (factorsA != factorsB) {
                return Integer.compare(factorsA, factorsB);
            }
            return Integer.compare(a, b);
        });

        return A; // Return the sorted ArrayList
    }

    // Function to count the number of distinct factors of a number
    private int countFactors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) {
                    count++;
                }
            }
        }
        return count;
    }



}
