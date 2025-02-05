package org.pixlaunch.module_05.day_33.assignment.ques_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    public int solve(ArrayList<Integer> A) {
        return findSingleElement(A);
    }

    public int findSingleElement(ArrayList<Integer> A) {
        int start = 0, end = A.size() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check which half to explore based on the pairing of elements
            if (mid % 2 == 0) {
                if (A.get(mid).equals(A.get(mid + 1))) {
                    start = mid + 2; // Single element is in the right half
                } else {
                    end = mid; // Single element is in the left half
                }
            } else {
                if (A.get(mid).equals(A.get(mid - 1))) {
                    start = mid + 1; // Single element is in the right half
                } else {
                    end = mid; // Single element is in the left half
                }
            }
        }

        return A.get(start); // When start == end, that's the single element
    }



}
