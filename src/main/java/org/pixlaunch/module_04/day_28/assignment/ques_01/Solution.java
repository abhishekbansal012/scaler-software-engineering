package org.pixlaunch.module_04.day_28.assignment.ques_01;

import java.util.ArrayList;

public class Solution {

    public int solve(int A, ArrayList<Integer> B) {
        int isExist = 0;

        for(int i=0;i<B.size(); i++) {
            for(int j=i;j<B.size();j++) {
                if (i!=j && B.get(i) + B.get(j) == A) {
                    isExist = 1;
                    break;
                }
            }
        }
        return isExist;
    }

}
