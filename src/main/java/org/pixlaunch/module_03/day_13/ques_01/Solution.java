package org.pixlaunch.module_03.day_13.ques_01;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        // Initialize an ArrayList to hold the column sums
        ArrayList<Integer> columnSums = new ArrayList<>();

        // Edge case: If matrix A is empty, return an empty list
        if (A.isEmpty()) {
            return columnSums;
        }

        // Get the number of columns (number of elements in the first row)
        int numCols = A.get(0).size();

        // Initialize column sums array with zeros
        for (int i = 0; i < numCols; i++) {
            columnSums.add(0);  // Start each column sum as 0
        }

        // Traverse each row in the matrix
        for (ArrayList<Integer> row : A) {
            // Traverse each element in the row and update the corresponding column sum
            for (int j = 0; j < numCols; j++) {
                columnSums.set(j, columnSums.get(j) + row.get(j));
            }
        }

        return columnSums;
    }


}
