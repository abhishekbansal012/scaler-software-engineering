package org.pixlaunch.module_03.day_16.assignment.ques_03;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public String solve(String A) {
        // Trim leading and trailing spaces and split the string into words
        String[] words = A.trim().split("\\s+");

        // Use a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }

}
