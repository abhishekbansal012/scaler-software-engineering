package org.pixlaunch.module_02.day_06.assignment.ques_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {
        Set<Integer> hSet = new HashSet<>();

        for (int i=0;i <A.size(); i++ ) {
            if(hSet.contains(B-A.get(i))) {
                return 1;
            }
            hSet.add(A.get(i));
        }

        return 0;
    }

}
