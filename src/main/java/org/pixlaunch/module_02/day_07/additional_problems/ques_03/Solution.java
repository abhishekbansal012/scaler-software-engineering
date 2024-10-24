package org.pixlaunch.module_02.day_07.additional_problems.ques_03;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {


        for(int i=1;i <A.size(); i++) {
            A.set(i, A.get(i-1)+A.get(i));
        }

        return A;
    }
}
