package org.pixlaunch.module_03.day_13.assignment.ques_03;

import java.util.ArrayList;

public class Solution {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A ) {

        int n = A.size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Traverse through each diagonal starting from the first row
        for (int col = 0; col < n; col++) {
            ArrayList<Integer> diagonal = new ArrayList<>();
            int i = 0, j = col;
            while (i < n && j >= 0) {
                diagonal.add(A.get(i).get(j));
                i++;
                j--;
            }
            while (diagonal.size() < n) {
                diagonal.add(0);
            }
            result.add(diagonal);
        }

        // Traverse through each diagonal starting from the last column
        for (int row = 1; row < n; row++) {
            ArrayList<Integer> diagonal = new ArrayList<>();
            int i = row, j = n - 1;
            while (i < n && j >= 0) {
                diagonal.add(A.get(i).get(j));
                i++;
                j--;
            }
            while (diagonal.size() < n) {
                diagonal.add(0);
            }
            result.add(diagonal);
        }

        return result;


    }


}
