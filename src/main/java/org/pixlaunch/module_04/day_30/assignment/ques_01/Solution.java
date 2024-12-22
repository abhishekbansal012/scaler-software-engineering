package org.pixlaunch.module_04.day_30.assignment.ques_01;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public String largestNumber(int[] A) {

        // Convert integers to strings
        ArrayList<String> strNums = new ArrayList<>();
        for (int num : A) {
            strNums.add(String.valueOf(num));
        }

        // Sort strings using custom comparator
        strNums.sort((a, b) -> (b + a).compareTo(a + b));

        // Handle case where all numbers are zero
        if (strNums.get(0).equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating sorted strings
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();

    }



}
