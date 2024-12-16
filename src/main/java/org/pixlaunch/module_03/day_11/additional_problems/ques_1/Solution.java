package org.pixlaunch.module_03.day_11.additional_problems.ques_1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        // Sort the ArrayList in increasing order
        Collections.sort(A);

        if(A.size() < 2) {
            return 1;
        }

        final int  difference = A.get(1) - A.get(0);
        for(int i =2; i<A.size();i++) {
            if(A.get(i) - A.get(i-1) != difference) {
                return 0;
            }
        }
        return 1;
    }

}
