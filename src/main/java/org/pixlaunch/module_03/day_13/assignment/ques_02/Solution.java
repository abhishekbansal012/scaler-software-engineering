package org.pixlaunch.module_03.day_13.assignment.ques_02;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solve(final List<ArrayList<Integer>> A) {

        int colSize = A.get(0).size();

        int sum = 0;
        for(int i=0;i <colSize; i++) {
            sum+= A.get(i).get(i);
        }

        return sum;

    }


}
