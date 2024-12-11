package org.pixlaunch.module_03.day_13.ques_04;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        // Initialize an ArrayList to hold the row sums
        ArrayList<Integer> rowSums = new ArrayList<>();

        // Edge case: If matrix A is empty, return an empty list
        if (A.isEmpty()) {
            return rowSums;
        }

        // Get the number of columns
        int numRows = A.size();
        int numCols = A.get(0).size();


        for(int i=0;i<numRows;i++) {
            int sum = 0;
            for(int j=0;j<numCols;j++) {
                sum += A.get(i).get(j);
            }
            rowSums.add(sum);
        }
        return rowSums;
    }


}
