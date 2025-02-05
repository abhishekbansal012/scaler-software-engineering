package org.pixlaunch.module_04.day_19.assignment.ques_02;

import java.util.ArrayList;

public class Solution {

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {

        int N= A.size();
        if(N==0) {
            return -1;
        }
        int M = A.get(0).size();
        int minIndex = Integer.MAX_VALUE;

        int i=0, j=M-1;
        while (i<N && j >= 0) {
            if(A.get(i).get(j)==B) {
                int index = (i + 1) * 1009 + (j + 1); // Convert to 1-based index
                minIndex = Math.min(minIndex, index);
                j--; // Move left to find a potentially smaller index
            } else if (A.get(i).get(j)<B) {
                i++;
            }else {
                j--;
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
